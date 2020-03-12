 package com.example.demo.pojo;

import java.util.Date;

public class auction {
private  Integer  auctionId;
private  Integer  id;
private  String  auctionName;
private  String  auctionStartPrice;
private  String  auctionUpset;
private  Date  auctionStartTime;
private  Date  auctionEndTime;
private  String  auctionPic;
private  String  auctionPicType;
private  String  auctionDesc;
public Integer getAuctionId() {
	return auctionId;
}
public void setAuctionId(Integer auctionId) {
	this.auctionId = auctionId;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAuctionName() {
	return auctionName;
}
public void setAuctionName(String auctionName) {
	this.auctionName = auctionName;
}
public String getAuctionStartPrice() {
	return auctionStartPrice;
}
public void setAuctionStartPrice(String auctionStartPrice) {
	this.auctionStartPrice = auctionStartPrice;
}
public String getAuctionUpset() {
	return auctionUpset;
}
public void setAuctionUpset(String auctionUpset) {
	this.auctionUpset = auctionUpset;
}
public Date getAuctionStartTime() {
	return auctionStartTime;
}
public void setAuctionStartTime(Date auctionStartTime) {
	this.auctionStartTime = auctionStartTime;
}
public Date getAuctionEndTime() {
	return auctionEndTime;
}
public void setAuctionEndTime(Date auctionEndTime) {
	this.auctionEndTime = auctionEndTime;
}
public String getAuctionPic() {
	return auctionPic;
}
public void setAuctionPic(String auctionPic) {
	this.auctionPic = auctionPic;
}
public String getAuctionPicType() {
	return auctionPicType;
}
public void setAuctionPicType(String auctionPicType) {
	this.auctionPicType = auctionPicType;
}
public String getAuctionDesc() {
	return auctionDesc;
}
public void setAuctionDesc(String auctionDesc) {
	this.auctionDesc = auctionDesc;
}
@Override
public String toString() {
	return "auction [auctionId=" + auctionId + ", id=" + id + ", auctionName=" + auctionName + ", auctionStartPrice="
			+ auctionStartPrice + ", auctionUpset=" + auctionUpset + ", auctionStartTime=" + auctionStartTime
			+ ", auctionEndTime=" + auctionEndTime + ", auctionPic=" + auctionPic + ", auctionPicType=" + auctionPicType
			+ ", auctionDesc=" + auctionDesc + "]";
}
public auction(Integer auctionId, Integer id, String auctionName, String auctionStartPrice, String auctionUpset,
		Date auctionStartTime, Date auctionEndTime, String auctionPic, String auctionPicType, String auctionDesc) {
	super();
	this.auctionId = auctionId;
	this.id = id;
	this.auctionName = auctionName;
	this.auctionStartPrice = auctionStartPrice;
	this.auctionUpset = auctionUpset;
	this.auctionStartTime = auctionStartTime;
	this.auctionEndTime = auctionEndTime;
	this.auctionPic = auctionPic;
	this.auctionPicType = auctionPicType;
	this.auctionDesc = auctionDesc;
}
public auction() {
	super();
	// TODO Auto-generated constructor stub
}

}
