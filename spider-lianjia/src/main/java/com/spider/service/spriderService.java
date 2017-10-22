package com.spider.service;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spider.mapper.LianjiaHouseMapper;
import com.spider.pojo.LianjiaHouse;
import com.spider.utils.GetFromUrl;
import com.spider.utils.LogUtil;

/**
 * 知乎用户
 */
public class spriderService {

	private static ApplicationContext context;
	private static LianjiaHouseMapper mapper;

	public static void main(String[] args) throws InterruptedException, IOException {
		context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		mapper = context.getBean(LianjiaHouseMapper.class);
		crawlerArea("https://hz.lianjia.com/ershoufang/xiacheng/", "hz");
//		crawler("https://hz.lianjia.com/ershoufang/xiaoshan/pg12/","hz","xiaoshan");
//		getJingduAndWeidu("https://hz.lianjia.com/ershoufang/103101669485.html");
	}
	
	//爬一个区,可以改造为多线程
	public static void crawlerArea(String url,String city) throws InterruptedException {
		String qu = url.substring(url.indexOf("fang/")+5,url.lastIndexOf("/"));
		String s = GetFromUrl.getFromUrl(url);
		Element page = Jsoup.parse(s);
		String page_data = page.select("#noResultPush + div > div + div > div").attr("page-data");
//		System.out.println(page_data);
		
		int start = page_data.indexOf(":")+1;
		int end = page_data.indexOf(",");
		int totalPage = Integer.parseInt(page_data.substring(start,end));
		
		//gongshu 11
		for(int i=1;i<=totalPage;i++){
			// 15分钟不行
			String tmpUrl = url;
			if(i!=1){
				tmpUrl = url+"pg"+i+"/";
			}
			LogUtil.logInfo("正在爬取第"+i+"页");
//			System.out.println();
			try {
				crawler(tmpUrl, city, qu);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread.sleep(1000*1800);
		}
		
	}
	
	//爬一页
	public static void crawler(String url,String city,String qu) throws IOException, InterruptedException {
//		String qu = url.substring(url.indexOf("fang/")+5,url.lastIndexOf("/"));
		
//		StringBuffer sb = new StringBuffer();
//		InputStream in = new FileInputStream(new File("/Users/zhanghaochen/Documents/workspace/spider-lianjia/src/main/resources/example1.txt"));
//		byte[] b = new byte[1024];
//		int len;
//		while ((len=in.read(b))!=-1) {
//			sb.append(new String(b, 0, len));
//		}
//		in.close();
//		System.out.println(sb);
		
		String s = GetFromUrl.getFromUrl(url);
		
		// Jsoup解析网页
		Element userUrlContent = Jsoup.parse(s);
		// 解析网页
		Elements houses = userUrlContent.select("li.clear");
		
		int cnt = 0;
		for (Element house : houses) {
			String title = house.select(".title > a").text();
			String xiaoqu = house.select(".houseInfo > a").text();
			
			if(cnt==0){
				cnt++;
				continue;
			}
			String mianji = house.select(".houseInfo").text();
			int start = mianji.indexOf("厅 | ")+4;
			int end = mianji.indexOf("平米");
			mianji = mianji.substring(start, end);
			
			String place = house.select(".positionInfo > a").text();
			// 关注和带看
			String followInfo = house.select(".followInfo").text();
			String focus = followInfo.substring(0,followInfo.indexOf("人关注"));
			String watch = followInfo.substring(followInfo.indexOf("共")+1, followInfo.indexOf("次带看"));
			
			//价格
			String totalPrice = house.select(".totalPrice > span").text();
			String avgPrice = house.select(".unitPrice").text();
			start = avgPrice.indexOf("价")+1;
			end = avgPrice.indexOf("元");
			avgPrice = avgPrice.substring(start, end);
			
			//经纬度
			String houseUrl = house.select(".title > a").attr("href");
			String jingduAndweidu = getJingduAndWeidu(houseUrl);
			int mid = jingduAndweidu.indexOf(",");
			String jingDu = jingduAndweidu.substring(0, mid);
			String weiDu = jingduAndweidu.substring(mid+1);
			
			//打印输出
//			System.out.println(title);
//			System.out.println("小区："+xiaoqu);
//			System.out.println("面积："+mianji);
//			System.out.println("地区："+place);
//			System.out.println("关注："+focus);
//			System.out.println("带看："+watch);
//			System.out.println("总价："+totalPrice);
//			System.out.println("平均："+avgPrice);
//			System.out.println("详情地址："+houseUrl);
//			System.out.println("经度："+jingDu);
//			System.out.println("纬度："+weiDu);
//			System.out.println("城市："+city);
//			System.out.println("区："+qu);
			Date date = new Date();
//			System.out.println(date);
//			System.out.println("--------------");
			
			//存入数据库
			LianjiaHouse houseBean = new LianjiaHouse();
			houseBean.setTitle(title);
			houseBean.setXiaoqu(xiaoqu);
			houseBean.setMianji(Float.parseFloat(mianji));
			houseBean.setPlace(place);
			houseBean.setFocus(Integer.parseInt(focus));
			houseBean.setWatch(Integer.parseInt(watch));
			
			if(totalPrice.contains(".")){
				totalPrice = totalPrice.substring(0, totalPrice.indexOf("."));
			}
			houseBean.setTotalPrice(Integer.parseInt(totalPrice));
			houseBean.setAvgPrice(Integer.parseInt(avgPrice));
			houseBean.setJingdu(Double.parseDouble(jingDu));
			houseBean.setWeidu(Double.parseDouble(weiDu));
			houseBean.setCity(city);
			houseBean.setQu(qu);
			houseBean.setDate(date);
			mapper.insert(houseBean);
			
			LogUtil.logInfo("抓取成功！");
			LogUtil.logInfo(houseBean.toString());
//			System.out.println("抓取成功！");
//			System.out.println(houseBean);
			cnt++;
			Thread.sleep(2000);
		}
//		System.out.println("爬取一页结束，共"+cnt+"条数据！");
		LogUtil.logInfo("爬取一页结束，共"+cnt+"条数据！");
	}
	
	private static String getJingduAndWeidu(String url) throws IOException {
//		StringBuffer sb = new StringBuffer();
//		InputStream in = new FileInputStream(new File("/Users/zhanghaochen/Documents/workspace/spider-lianjia/src/main/resources/example2.txt"));
//		byte[] b = new byte[1024];
//		int len;
//		while ((len=in.read(b))!=-1) {
//			sb.append(new String(b, 0, len));
//		}
//		in.close();
		
		String s;
		do{
			s = GetFromUrl.getFromUrl(url);
		}while(s.contains("302 Found"));
		
		int start = s.indexOf("resblockPosition")+18;
		int end = s.indexOf("',", start);
		String result = s.substring(start, end);
//		System.out.println(result);
		
		return result;
	}
	
	
}