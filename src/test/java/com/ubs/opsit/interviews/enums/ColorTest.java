package com.ubs.opsit.interviews.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ColorTest {

	@Test
	public void testRed() {
		assertEquals("R", Color.RED.toString());
	}

	@Test
	public void testYellow() {
		assertEquals("Y", Color.YELLOW.toString());
	}

}
