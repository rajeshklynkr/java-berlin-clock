package com.ubs.opsit.interviews.timeunit;

import com.ubs.opsit.interviews.enums.Color;

public class SecondTimeUnit {

	/**
	 * Converts to Berlin sec for a given sec.
	 * 
	 * @param sec
	 *            regular sec time.
	 * @return Berlin sec string.
	 */
	public String convertTime(int sec) {
		return (sec % 2 == 0) ? Color.YELLOW.toString() : "O";
	}
}
