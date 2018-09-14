package com.itheima.web.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorld {
	@RequestMapping("/getName")
	public String getName() {
		System.out.println("111");
		System.out.println("222");
		System.out.println("333");
		System.out.println("444");
		System.out.println("555");
		System.out.println("666");
		return "itheima";
		
	}
			
}
