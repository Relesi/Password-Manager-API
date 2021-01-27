package com.renato.management.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renato.management.service.impl.PasswordManagementServiceImpl;

/**
 * Resource Class for method to password manager
 * 
 * @author renato.lessa
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class PasswordManagementResource {
	
	@Autowired
	private PasswordManagementServiceImpl passwordMagementService;

	private static final Logger log = LoggerFactory.getLogger(PasswordManagementResource.class);

	@PostMapping(value = "/management-password")
	public Boolean passwordValidation(@RequestHeader(value = "password") String password) throws Exception {

		log.info("Starting password validation...");

		return this.passwordMagementService.validationPassword(password);

	}

}