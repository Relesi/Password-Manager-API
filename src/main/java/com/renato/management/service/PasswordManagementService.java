package com.renato.management.service;

public interface PasswordManagementService {

	/**
	 * Classe interface for to recive PasswordValidationServiceImpl
	 * 
	 * @param password
	 * @return Boolean
	 * @author renato.lessa
	 */

	Boolean validationPassword(String password);
}