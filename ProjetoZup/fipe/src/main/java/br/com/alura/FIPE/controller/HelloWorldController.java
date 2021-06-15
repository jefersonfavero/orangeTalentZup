package br.com.alura.FIPE.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController			
public class HelloWorldController {
	
	@RequestMapping("/")
	@ResponseBody
	public String HelloController() {
		System.out.println("tudo ok");
		return "HelloWorld";
	}
}
