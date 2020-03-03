package com.example.demo.action;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.biz.PersonBiz;
import com.example.demo.pojo.Person;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/persons") // 命名空间
public class PersonAction {

	@Autowired
	private PersonBiz personBiz;

	@GetMapping("{p}/{s}")
	public PageInfo<Person> queryPage(@PathVariable Integer p, @PathVariable Integer s) throws Exception {
		// Thread.sleep(2000);
		return personBiz.findPersonListByPage(p, s);
	}

	@GetMapping("person/{pid}")
	public Person queryPersonById(@PathVariable Integer pid) {
		return personBiz.getPersonById(pid);
	}

	@DeleteMapping("person/{pid}")
	public Map<String, Object> deletePersonById(@PathVariable Integer pid) {
		personBiz.removePersonById(pid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PutMapping("person")
	public Map<String, Object> updatePerson(@RequestBody Person pojo) {
		personBiz.modifyPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PostMapping("person")
	public ModelAndView addPerson(Person pojo, MultipartFile imgFile) {
		try {
			String exFileName = imgFile.getOriginalFilename().substring(imgFile.getOriginalFilename().lastIndexOf("."));
			String fileName = UUID.randomUUID().toString().replace("-", "") + exFileName;
			// 获得本地路径
			imgFile.transferTo(new File("D:/myfile/images/" + fileName));// 非常重要
			pojo.setPimg(fileName);
			personBiz.addPerson(pojo);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return new ModelAndView("redirect:/personList.html");
	}

	@PostMapping("person2")
	public Map<String, Object> addPerson2(@RequestBody Person pojo) {
		personBiz.addPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

}
