package com.ubs.opsit.interviews.validator;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
	Validator validator;

	@Before
	public void setUp() {
		validator = new Validator();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUpperInvalidHours() {
		validator.validate("25:00:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUpperInvalidMinutes() {
		validator.validate("00:61:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUpperInvalidSeconds() {
		validator.validate("00:00:61");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLowerInvalidHours() {
		validator.validate("-01:00:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLowerInvalidMinutes() {
		validator.validate("00:-01:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLowerInvalidSeconds() {
		validator.validate("00:00:-01");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidString() {
		validator.validate("00:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullString() {
		validator.validate(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmptyString() {
		validator.validate("");
	}
}
