package com.springcloud.docker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		Integer i = 200;
		Integer j = 200;
		System.out.println(i.equals(j));
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "123");
		System.out.println(map);
		SpringApplication.run(App.class, args);
	}
}
