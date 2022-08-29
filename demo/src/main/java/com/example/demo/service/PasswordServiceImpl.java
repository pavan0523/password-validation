package com.example.demo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordServiceImpl implements PasswordService {
	
	@Override
	public boolean validatePassword(String password) {
		boolean invalid = false;
		if (password == null) {
			invalid = true;
		}
		if (password != null) {
			if (password.length() < 5 || password.length() > 12) {
				invalid = true;
			}

			String regex = "(\\w+)\\1+";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			invalid = m.find();

		}

		return invalid;
	}

}
