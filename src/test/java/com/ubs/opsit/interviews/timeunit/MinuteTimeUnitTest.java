package com.ubs.opsit.interviews.timeunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.constant.Constants;

public class MinuteTimeUnitTest {
	MinuteTimeUnit minutes;

	@Before
	public void setUp() {
		minutes = new MinuteTimeUnit();
	}

	@Test
	public void allMinutesOn() {
		StringBuilder expected = new StringBuilder();
		expected.append("YYRYYRYYRYY");
		expected.append(Constants.NEW_LINE);
		expected.append("YYYY");

		assertEquals(expected.toString(), minutes.convertTime(59));
	}

	@Test
	public void bottomOn() {
		StringBuilder expected = new StringBuilder();
		expected.append("OOOOOOOOOOO");
		expected.append(Constants.NEW_LINE);
		expected.append("YYYY");

		assertEquals(expected.toString(), minutes.convertTime(04));
	}

	@Test
	public void TopFirst1AndBottomFirst1On() {
		StringBuilder expected = new StringBuilder();
		expected.append("YYROOOOOOOO");
		expected.append(Constants.NEW_LINE);
		expected.append("YOOO");

		assertEquals(expected.toString(), minutes.convertTime(16));
	}
}
