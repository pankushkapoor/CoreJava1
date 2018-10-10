package com.capgemini.core.a10_2_2;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testException {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = EmployeeException.class)
	public void testChecksalary() throws EmployeeException {
		ExceptionCheck c = new ExceptionCheck();
		c.checksalary(2000);

	}
}
