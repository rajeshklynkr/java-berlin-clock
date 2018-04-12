package com.ubs.opsit.interviews.timeunit;

import com.ubs.opsit.interviews.constant.Constants;
import com.ubs.opsit.interviews.enums.Color;

public class HoursTimeUnit {

	/**
	 * Converts to Berlin hours for a given hrs.
	 * 
	 * @param hrs
	 *            regular hrs time.
	 * @return Berlin hrs string.
	 */
	public String convertTime(int hrs) {
		StringBuilder result = new StringBuilder();
		result.append(getTopHoursTime(hrs)).append(Constants.NEW_LINE)
				.append(getBottomHoursTime(hrs));

		return result.toString();
	}

	private String getTopHoursTime(int h) {
		StringBuilder lamps = new StringBuilder(Constants.ALL_LIGHTS_OFF);
		for (int i = 0; i < (h / Constants.MULTIPLE_OF_FIVE); i++) {
			lamps.replace(i, i + 1, Color.RED.toString());
		}
		return lamps.toString();
	}

	private String getBottomHoursTime(int h) {
		StringBuilder lmp = new StringBuilder(Constants.ALL_LIGHTS_OFF);
		for (int i = 0; i < (h % Constants.MULTIPLE_OF_FIVE); i++) {
			lmp.replace(i, i + 1, Color.RED.toString());
		}
		return lmp.toString();
	}
}