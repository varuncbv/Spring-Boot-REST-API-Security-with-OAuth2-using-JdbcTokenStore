package com.letsstartcoding.springbootrestapioauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	 @GetMapping(value = "/")
	    public String index(){
	        return "Hello world";
	    }

	    @GetMapping(value = "/demo")
	    public String privateArea(){
	        return "Welcome To OAuth Demo";
	    }

	}
