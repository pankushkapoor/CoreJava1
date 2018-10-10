package com.capgemini.core.a10_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testDate {

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
	public void testDate() {
		Date d=new Date(10,12,2018);
	}

	@Test
	public void testSetDay() {
		Date d=new Date(10,12,2018);
		d.setDay(11);
	}

	@Test
	public void testGetDay() {
		Date d=new Date(10,12,2018);
		d.getDay();
	}

	@Test
	public void testSetMonth() {
		Date d=new Date(10,12,2018);
		d.setMonth(11);
	}

	@Test
	public void testGetMonth() {
		Date d=new Date(10,12,2018);
		d.getMonth();
	}

	@Test
	public void testSetYear() {
		Date d=new Date(10,12,2018);
		d.setYear(2018);;
		
		
	}

	@Test
	public void testGetYear() {
		Date d=new Date(10,12,2018);
		d.getYear();
	}

}
