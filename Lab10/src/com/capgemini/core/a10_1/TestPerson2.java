package com.capgemini.core.a10_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPerson2 {

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

	@Test
	public void testGetFullName() {

		System.out.println("from TestPerson2");
		Person per = new Person("Robert", "King");
		assertEquals("Robert King", per.getFullName());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNullInName() {
		System.out.println("from TestPerson2 testing exceptions");
		Person per1 = new Person(null, null);
	}
	@Test
	public void testGetFirstName() {
		// TODO Auto-generated method stub
		System.out.println("from TestPerson2 First Name");
		Person per = new Person("Robert", "");
		assertEquals("Robert", per.getFirstName());

	}
	@Test
	public void testGetLastName() {
		// TODO Auto-generated method stub
		System.out.println("from TestPerson2 Last Name");
		Person per = new Person("", "King");
		assertEquals("King", per.getLastName());

	}
}
