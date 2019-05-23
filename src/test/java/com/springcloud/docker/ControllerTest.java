package com.springcloud.docker;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class ControllerTest extends AppTest {

	@Autowired
	private WebApplicationContext context;

	public MockMvc mockMvc;

	@Before
	public void before() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void test() {
		/*
		 * System.out.print("============" + mockMvc); try {
		 * mockMvc.perform(MockMvcRequestBuilders.get("/test")).andExpect(
		 * MockMvcResultMatchers.status().isOk()) .andDo(MockMvcResultHandlers.print());
		 * } catch (Exception e) { // TODO Auto-generated catch block Assert.fail();
		 * e.printStackTrace(); }
		 */
	}
}
