package com.nt.rahu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator cal = new Calculator();
		int expected = 2;
		int actual = cal.add(1, 1);
		assertEquals(expected, actual);
	}
	@Test
	void radiusTest() {
		Calculator cal = new Calculator();
		assertEquals(314, cal.radius(10));
	}

}
