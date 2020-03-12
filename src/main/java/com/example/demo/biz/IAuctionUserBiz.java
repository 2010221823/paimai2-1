package com.example.demo.biz;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.dao.IAuctionUserDao;
import com.example.demo.pojo.auctionUser;

public class IAuctionUserBiz {
     @Autowired
 private IAuctionUserDao dao;
     
 	/**
 	 * 登录
 	 * 
 	 * @param student
 	 * @return
 	 */
 	public auctionUser findByLogin(String name, String pwd) {
 		QueryWrapper<auctionUser> qw = Wrappers.query();
 		qw.eq("name", name).eq("pwd", pwd);
 		return dao.selectOne(qw);
 	}
}
