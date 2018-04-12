package com.ubs.opsit.interviews.timeunit;

import com.ubs.opsit.interviews.constant.Constants;
import com.ubs.opsit.interviews.enums.Color;

public class MinuteTimeUnit {

	/**
	 * Converts to Berlin minutes for a given minutes.
	 * 
	 * @param min
	 *            regular minutes time.
	 * @return Berlin minutes string.
	 */
	public String convertTime(int min) {
		int minuteDivided = min / 5;
		int minuteModule = min % 5;
		return getBottomMinutesTime(minuteDivided) + Constants.NEW_LINE
				+ getTopMinutesTime(minuteModule);
	}

	private String getTopMinutesTime(int min) {
		StringBuilder lmp = new StringBuilder(Constants.ALL_FOUR_LIGHTS_OFF);
		for (int i = 0; i < min; i++) {
			lmp.replace(i, i + 1, Color.YELLOW.toString());
		}
		return lmp.toString();
	}

	private String getBottomMinutesTime(int min) {
		StringBuilder lmp = new StringBuilder(Constants.ALL_ELVN_LIGHTS_OFF);
		for (int i = 0; i < min; i++) {
			if (0 == (i + 1) % 3) {
				lmp.replace(i, i + 1, Color.RED.toString());
			} else {
				lmp.replace(i, i + 1, Color.YELLOW.toString());
			}
		}
		return lmp.toString();
	}
}
