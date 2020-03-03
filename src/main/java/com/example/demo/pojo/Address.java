package com.example.demo.pojo;

public class Address {

	private Integer aid;
	private String aname;
	private String atel;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAtel() {
		return atel;
	}

	public void setAtel(String atel) {
		this.atel = atel;
	}

	public Address() {
		super();
	}

	public Address(String aname, String atel) {
		super();
		this.aname = aname;
		this.atel = atel;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aname=" + aname + ", atel=" + atel + "]";
	}

}
