package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public interface PasswordService {
	boolean validatePassword(String password);

}
