package com.renato.management.service;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.renato.management.service.impl.PasswordManagementServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PasswordManagementServiceImplTest {

	@InjectMocks
	private PasswordManagementServiceImpl ManagementService;

	public static final String PASSWORD_VALID = null;
	public static final String PASSWORD_NOT_VALID = "IIITTAAAUUU";

	@Test(expected = Exception.class)
	public void should_ReturnAValidePassword() {

		when(ManagementService.validationPassword(PASSWORD_VALID)).thenReturn(Boolean.TRUE);

	}

	@Test
	public void should_ThrowAnExceptionWhenThePasswordIsNull() {

		ManagementService.validationPassword("s");
	}

	@Test(expected = Exception.class)
	public void should_ReturnAFalsePassword() {
		when(ManagementService.validationPassword(PASSWORD_NOT_VALID)).thenReturn(Boolean.FALSE);
	}
}