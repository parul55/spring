package com.zensar.services.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloService {
	@GetMapping
	public String sayHello() {
		return "Hello from PARUL";
	}
}
