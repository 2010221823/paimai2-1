package com.example.demo.pojo;

public class auctionRecord {
private Integer id;
private Integer userId;
private Integer auctionId;
private Integer auctionTime;
private Integer auctionPrice;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public Integer getAuctionId() {
	return auctionId;
}
public void setAuctionId(Integer auctionId) {
	this.auctionId = auctionId;
}
public Integer getAuctionTime() {
	return auctionTime;
}
public void setAuctionTime(Integer auctionTime) {
	this.auctionTime = auctionTime;
}
public Integer getAuctionPrice() {
	return auctionPrice;
}
public void setAuctionPrice(Integer auctionPrice) {
	this.auctionPrice = auctionPrice;
}
@Override
public String toString() {
	return "auctionRecord [id=" + id + ", userId=" + userId + ", auctionId=" + auctionId + ", auctionTime="
			+ auctionTime + ", auctionPrice=" + auctionPrice + "]";
}
public auctionRecord() {
	super();
	// TODO Auto-generated constructor stub
}
public auctionRecord(Integer id, Integer userId, Integer auctionId, Integer auctionTime, Integer auctionPrice) {
	super();
	this.id = id;
	this.userId = userId;
	this.auctionId = auctionId;
	this.auctionTime = auctionTime;
	this.auctionPrice = auctionPrice;
}

}
