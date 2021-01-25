package com.renato.management.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * Controller class for method to password validation
 * 
 * @author renato.lessa
 */

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Password Management ")
@CrossOrigin(origins = "*")
public class PasswordManagementResource {

	private static final Logger log = LoggerFactory.getLogger(PasswordManagementResource.class);

	@PostMapping(value = "/management-password")
	public Boolean passwordValidation(@RequestHeader(value = "password") String password) throws Exception {

		log.info("Starting password validation...");

		return null;

	}

}