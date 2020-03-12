package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.Jl;
import com.example.demo.vo.jieshupmpvo;
import com.example.demo.vo.jingpaivo;
import com.example.demo.vo.jingpaizhongpmpvo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface JlMapper extends BaseMapper<Jl>{
     List<jingpaivo> aaa(@Param("pmpid") Integer pmpid);
     jingpaivo jia(@Param("pmpid") Integer pmpid);
     List<jieshupmpvo> jieshupmp();
     List<jingpaizhongpmpvo> jingpaizhongpmp();
}