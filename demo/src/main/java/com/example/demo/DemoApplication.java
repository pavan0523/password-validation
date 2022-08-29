package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.PasswordService;
import com.example.demo.service.PasswordServiceImpl;

@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String s ="clipeer123";
		PasswordService passwordService=new PasswordServiceImpl();
		boolean validatePassword = passwordService.validatePassword(s);
		System.out.println(validatePassword);
	}

}
