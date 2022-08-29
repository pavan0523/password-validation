package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.PasswordService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private PasswordService passwordService;

	@Test
	public void validPasswordsTest() {
		String[] validPasswords = { "a1234", "abc123", "abcd1", "abc123", "restful0" };
		List<Object> asList = Arrays.asList(validPasswords);
		for (Object validPassword : asList) {
			assertTrue(passwordService.validatePassword((String) validPassword));

		}
	}

	@Test
	public void invalidPasswordsTest() {
		String[] validPasswords = { "1234", "Abc123", "12345", "clipper123", "vn123123", "abcde12345678",
				"ABCDE12345678", "hel%@123" };
		List<Object> asList = Arrays.asList(validPasswords);
		for (Object invalidPassword : asList) {
			assertFalse(passwordService.validatePassword((String) invalidPassword));

		}
	}

}
