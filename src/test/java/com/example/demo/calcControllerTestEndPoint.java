package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calcControllerTestEndPoint {

	private String sut;
	@Before
    public void setUp() throws Exception {
		sut = "http://localhost:8080/calc?";
    }
	
	@Test
	public void test() {
		//http://localhost:8080/calc?num1=200&num2=12&operation=%2b
		String firstnumber = "num1=200";
		String and = "&";
		String secondnumber = "num2=12";
		String op = "operation=%2b";
		
		String completeUrl = sut + firstnumber + and + secondnumber + and + op;
		System.out.println(completeUrl);
		String actual = "http://localhost:8080/calc?num1=200&num2=12&operation=%2b";
		String expected = completeUrl;
		
		assertEquals(actual, expected);
		
	}

}
