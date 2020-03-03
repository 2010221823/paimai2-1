package com.example.demo.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IPersonDao;
import com.example.demo.pojo.Person;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PersonBiz {

	private IPersonDao personDao;//嘿嘿

	public PageInfo<Person> findPersonListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Person>(personDao.queryAllPersons());
	}

	public Person getPersonById(Integer pid) {
		return personDao.loadPerson(pid);
	}
	
	public void removePersonById(Integer pid) {
		personDao.deletePerson(pid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyPerson(Person person) {
		personDao.deletePerson(person.getPid());
		personDao.savePerson(person);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(Person person) {
		personDao.savePerson(person);
	}

}
