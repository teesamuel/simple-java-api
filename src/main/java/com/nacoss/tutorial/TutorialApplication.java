package com.nacoss.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
//@Controller
public class TutorialApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(TutorialApplication.class, args);
	}

//	@GetMapping("/here")
//	public  String index(){
//		return  "Welcome guys";
//	}


}
