package com.example.demo.service;

public class PasswordTest {

	public static void main(String[] args) {
		String s ="clipeer123";
		PasswordService passwordService=new PasswordServiceImpl();
		boolean validatePassword = passwordService.validatePassword(s);
		System.out.println(validatePassword);

	}

}
