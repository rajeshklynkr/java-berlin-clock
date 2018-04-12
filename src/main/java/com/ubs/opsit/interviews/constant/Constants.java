package com.ubs.opsit.interviews.constant;

public final class Constants {
	public static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
	public static final String ALL_ELVN_LIGHTS_OFF = "OOOOOOOOOOO";
	public static final String NEW_LINE = System.getProperty("line.separator");
	public static final String NO_TIME_ERROR = "No time provided";
	public static final String INVALID_TIME_ERROR = "Invalid time provided.";
	public static final String NUMERIC_TIME_ERROR = "Time values must be numeric.";
	public static final String ALL_LIGHTS_OFF = "OOOO";
	public static final int MULTIPLE_OF_FIVE = 5;
	public static final String SECONDS_OUT_OF_BOUNDS = "Seconds out of bounds.";
	public static final String MINUTES_OUT_OF_BOUNDS = "Minutes out of bounds.";
	public static final String HOURS_OUT_OF_BOUNDS = "Hours out of bounds.";

	private Constants() {
		throw new IllegalAccessError("Illegal Access Error");
	}
}
