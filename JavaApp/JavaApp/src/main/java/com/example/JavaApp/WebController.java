package com.example.JavaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
	
public class WebController {

	    @GetMapping("/hello")
	    public String hello() {
	        return "Hello To Devops World";
	    }
	}