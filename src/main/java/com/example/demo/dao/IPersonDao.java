package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.Person;


public interface IPersonDao {

	public List<Person> queryAllPersons();

	public Person loadPerson(@Param("pid") Integer pid);
	
	public int updatePerson(@Param("person") Person person);

	public int savePerson(@Param("person") Person person);
	
	public int deletePerson(@Param("pid") Integer pid);
	

}
