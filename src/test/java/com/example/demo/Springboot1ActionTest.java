package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class Springboot1ActionTest {

	private Logger logger = LoggerFactory.getLogger(Springboot1ActionTest.class);

	@Autowired
	private WebApplicationContext wac;// 非常重要

	private MockMvc mockMvc;// mvc_handler测试对象

	@BeforeEach
	public void initMockMvc() {
		// 构建者模式
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	/**
	 * 关键方法 
	 * perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
	 * andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确；
	 * andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台；
	 * andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理；
	 */
	@Test
	public void testActionList() throws Exception {
		// 模拟一个http请求 get(action地址)
		MvcResult rs = mockMvc.perform(get("/api/persons/1/3")).andExpect(status().isOk()).andDo(print()).andReturn();
		String ctx = rs.getResponse().getContentAsString();// 字符串内容输出
		logger.debug(ctx);
	}

}
