package com.springcloud.docker;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class ControllerTester extends AppTest {

	@Test
	public void test() {
		System.out.print("============" + mockMvc);
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/test")).andExpect(MockMvcResultMatchers.status().isOk())
					.andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail();
			e.printStackTrace();
		}
	}
}
