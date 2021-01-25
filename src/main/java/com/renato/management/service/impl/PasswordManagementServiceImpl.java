package com.renato.management.service.impl;

import org.springframework.stereotype.Service;

import com.renato.management.service.PasswordManagementService;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe interface for to recive PasswordValidationServiceImpl
 * 
 * @param password
 * @return Boolean
 * @author renato.lessa
 */

@Service
public class PasswordManagementServiceImpl implements PasswordManagementService {

	private Pattern pattern;

	private Matcher matcher;

	public static final String VALID_CHARACTERS = "^(?:([A-Za-z0-9!@#$%^&*()\\-+])(?!.*\\1)){9,}$";

	public PasswordManagementServiceImpl() {
		this.pattern = Pattern.compile(VALID_CHARACTERS);
	}

	public Boolean validationPassword(String password) {
		

		return this.matcher.matches();

	}

}