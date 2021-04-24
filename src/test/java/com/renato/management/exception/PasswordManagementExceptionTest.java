package com.renato.management.exception;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.renato.management.excptions.PasswordManagementException;

public class PasswordManagementExceptionTest {

	@Test
	public void shouldCreateAnException() {

		PasswordManagementException passwordException = new PasswordManagementException(
				new PasswordManagementException());
		assertNotNull(passwordException);

		PasswordManagementException passwordException1 = new PasswordManagementException("msg", null);
		assertNotNull(passwordException1);

		PasswordManagementException passwordException2 = new PasswordManagementException("msg");
		assertNotNull(passwordException2);

		PasswordManagementException passwordException3 = new PasswordManagementException();
		assertNotNull(passwordException3);

	}

}
