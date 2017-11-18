package com.spider.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spider.mapper.LianjiaHouseMapper;
import com.spider.pojo.LianjiaHouse;
import com.spider.utils.GetFromUrl;

public class TestDao {

	@Test
	public void testDao() throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		LianjiaHouseMapper mapper = context.getBean(LianjiaHouseMapper.class);

		LianjiaHouse bean = new LianjiaHouse();
		bean.setTitle("中文");
		mapper.insert(bean);
	}

	// i am master

	@Test
	public void testPage(){
		System.out.println(Jsoup.parse(GetFromUrl.getFromUrl("https://hz.lianjia.com/ershoufang/xiasha/")));
	}
	
}
