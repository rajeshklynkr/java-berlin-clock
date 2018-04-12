package com.ubs.opsit.interviews.validator;

public class Preconditions {
	public static void validate(boolean condition, String message) {
		if (!condition)
			throw new IllegalArgumentException(message);
	}
}