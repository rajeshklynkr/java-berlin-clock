package com.ubs.opsit.interviews.validator;

import org.junit.Test;

public class PreconditionsTest {

	@Test(expected = IllegalArgumentException.class)
	public void testErrorCase() {
		Preconditions.validate(false, "Error Message");
	}

	@Test()
	public void testSuccessCase() {
		Preconditions.validate(true, "Success Message");
	}
}
