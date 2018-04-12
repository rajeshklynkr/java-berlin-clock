package com.ubs.opsit.interviews.timeunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SecondTimeUnitTest {
	SecondTimeUnit seconds;

	@Before
	public void setUp() {
		seconds = new SecondTimeUnit();
	}

	@Test
	public void secondsOn() {
		assertEquals("Y", seconds.convertTime(20));
	}

	@Test
	public void secondsOff() {
		assertEquals("O", seconds.convertTime(21));
	}
}
