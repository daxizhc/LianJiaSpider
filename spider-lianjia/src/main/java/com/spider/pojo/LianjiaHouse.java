package com.spider.pojo;

import java.util.Date;

public class LianjiaHouse {
    private Integer id;

    private String title;

    private String xiaoqu;

    private Float mianji;

    private String place;

    private Integer focus;

    private Integer watch;

    private Integer totalPrice;

    private Integer avgPrice;

    private Double jingdu;

    private Double weidu;

    private String city;

    private String qu;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getXiaoqu() {
        return xiaoqu;
    }

    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu == null ? null : xiaoqu.trim();
    }

    public Float getMianji() {
        return mianji;
    }

    public void setMianji(Float mianji) {
        this.mianji = mianji;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Integer getFocus() {
        return focus;
    }

    public void setFocus(Integer focus) {
        this.focus = focus;
    }

    public Integer getWatch() {
        return watch;
    }

    public void setWatch(Integer watch) {
        this.watch = watch;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Integer avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getJingdu() {
        return jingdu;
    }

    public void setJingdu(Double jingdu) {
        this.jingdu = jingdu;
    }

    public Double getWeidu() {
        return weidu;
    }

    public void setWeidu(Double weidu) {
        this.weidu = weidu;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu == null ? null : qu.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

	@Override
	public String toString() {
		return "LianjiaHouse [id=" + id + ", title=" + title + ", xiaoqu=" + xiaoqu + ", mianji=" + mianji + ", place="
				+ place + ", focus=" + focus + ", watch=" + watch + ", totalPrice=" + totalPrice + ", avgPrice="
				+ avgPrice + ", jingdu=" + jingdu + ", weidu=" + weidu + ", city=" + city + ", qu=" + qu + ", date="
				+ date + "]";
	}
    
    
}