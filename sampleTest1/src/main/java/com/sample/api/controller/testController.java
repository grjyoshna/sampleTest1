package com.sample.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cn")
public class testController {
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello World!";
	}

}
