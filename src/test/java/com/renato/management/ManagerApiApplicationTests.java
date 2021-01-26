package com.renato.management;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ManagerApiApplicationTests {

	@Before
	public void setUp() throws IOException {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMain() {
		ManagerApiApplication.main(new String[] {"Test"});
		assertNotNull(ManagerApiApplication.class);
	}
	
	@Test
	public void testMainNotNull() {
	assertNotNull(ManagerApiApplication.class);
	}

	
	
}



