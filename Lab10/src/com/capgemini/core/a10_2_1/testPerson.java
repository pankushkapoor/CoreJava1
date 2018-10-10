package com.capgemini.core.a10_2_1;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPerson {

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
	public void testGetFname() {
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.getFname();
	}

	@Test
	public void testGetLname() {
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.getLname();
	}

	@Test
	public void testGetGender() {
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.getGender();
	}

	@Test
	public void testGetAge() {
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.getAge();
	}

	@Test
	public void testGetWeight() {
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.getWeight();
	}

	@Test
	public void testPrintprofile() {
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.printprofile();
	}

}
