package com.ubs.opsit.interviews.timeunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.constant.Constants;

public class HoursTimeUnitTest {
	HoursTimeUnit hours;

	@Before
	public void setUp() {
		hours = new HoursTimeUnit();
	}

	@Test
	public void allHoursOn() {
		StringBuilder expected = new StringBuilder();
		expected.append("RRRR");
		expected.append(Constants.NEW_LINE);
		expected.append("RRRR");

		assertEquals(expected.toString(), hours.convertTime(24));
	}

	@Test
	public void last4HoursOn() {
		StringBuilder expected = new StringBuilder();
		expected.append("OOOO");
		expected.append(Constants.NEW_LINE);
		expected.append("RRRR");

		assertEquals(expected.toString(), hours.convertTime(04));
	}

	@Test
	public void last1AndFirst1HoursOn() {
		StringBuilder expected = new StringBuilder();
		expected.append("ROOO");
		expected.append(Constants.NEW_LINE);
		expected.append("ROOO");

		assertEquals(expected.toString(), hours.convertTime(6));
	}
}
