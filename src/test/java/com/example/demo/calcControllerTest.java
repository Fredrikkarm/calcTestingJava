package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calcControllerTest {
	
	private calcController sut;

    @Before
    public void setUp() throws Exception {
        sut = new calcController();
    }

	@Test
	public void testCalculatorAdd() {
		int val1 = 5;
		int val2 = 10;
		char op = '+';
		int result = val1 + val2;
		int incorrectResultAdd = val1 + val2 + 10;
		
		String actual = sut.calculator(val1, val2, op);

		String pattern = "%s %s %s = %s";
		String expected = String.format(pattern, val1, op, val2, result);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testCalculatorSub() {
		int val3 = 5;
		int val4 = 10;
		char op = '-';
		int result = val3 - val4;
		int incorrectResultSub = val3 - val4 + 10;
		
		String actual = sut.calculator(val3, val4, op);

		String pattern = "%s %s %s = %s";
		String expected = String.format(pattern, val3, op, val4, result);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testCalculatorMul() {
		int val5 = 5;
		int val6 = 10;
		char op = '*';
		int result = val5 * val6;
		int incorrectResultMul = val5 * val6 + 10;
		
		String actual = sut.calculator(val5, val6, op);

		String pattern = "%s %s %s = %s";
		String expected = String.format(pattern, val5, op, val6, result);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testCalculatorDiv() {
		int val7 = 150;
		int val8 = 2;
		char op = '/';
		int result = val7 / val8;
		int incorrectResultDiv = val7 / val8 + 10;
		
		String actual = sut.calculator(val7, val8, op);

		String pattern = "%s %s %s = %s";
		String expected = String.format(pattern, val7, op, val8, result);
		
		assertEquals(actual, expected);
	}

}
