package com.example.demo.pojo;

public class auctionUser {
private Integer userId;
private String userName;
private String userPassword;
private String userCardNo;
private String userTel;
private String userAddress;
private String userPostNumber;
private String userIsadmin;
private String userQuestion;
private String userAnswer;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getUserCardNo() {
	return userCardNo;
}
public void setUserCardNo(String userCardNo) {
	this.userCardNo = userCardNo;
}
public String getUserTel() {
	return userTel;
}
public void setUserTel(String userTel) {
	this.userTel = userTel;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getUserPostNumber() {
	return userPostNumber;
}
public void setUserPostNumber(String userPostNumber) {
	this.userPostNumber = userPostNumber;
}
public String getUserIsadmin() {
	return userIsadmin;
}
public void setUserIsadmin(String userIsadmin) {
	this.userIsadmin = userIsadmin;
}
public String getUserQuestion() {
	return userQuestion;
}
public void setUserQuestion(String userQuestion) {
	this.userQuestion = userQuestion;
}
public String getUserAnswer() {
	return userAnswer;
}
public void setUserAnswer(String userAnswer) {
	this.userAnswer = userAnswer;
}
@Override
public String toString() {
	return "auctionUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
			+ ", userCardNo=" + userCardNo + ", userTel=" + userTel + ", userAddress=" + userAddress
			+ ", userPostNumber=" + userPostNumber + ", userIsadmin=" + userIsadmin + ", userQuestion=" + userQuestion
			+ ", userAnswer=" + userAnswer + "]";
}
public auctionUser(Integer userId, String userName, String userPassword, String userCardNo, String userTel,
		String userAddress, String userPostNumber, String userIsadmin, String userQuestion, String userAnswer) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPassword = userPassword;
	this.userCardNo = userCardNo;
	this.userTel = userTel;
	this.userAddress = userAddress;
	this.userPostNumber = userPostNumber;
	this.userIsadmin = userIsadmin;
	this.userQuestion = userQuestion;
	this.userAnswer = userAnswer;
}
public auctionUser() {
	super();
	// TODO Auto-generated constructor stub
}

}
