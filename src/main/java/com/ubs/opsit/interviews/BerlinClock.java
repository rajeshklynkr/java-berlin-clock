package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.constant.Constants;
import com.ubs.opsit.interviews.timeunit.HoursTimeUnit;
import com.ubs.opsit.interviews.timeunit.MinuteTimeUnit;
import com.ubs.opsit.interviews.timeunit.SecondTimeUnit;
import com.ubs.opsit.interviews.validator.Validator;
import com.ubs.opsit.interviews.vo.Time;

public class BerlinClock implements TimeConverter {

	/**
	 * Converts to Berlin Time for a given time string.
	 * 
	 * @param aTime
	 *            aTime string in HH:mm:ss format
	 * @return Berlin Time string.
	 */
	@Override
	public String convertTime(String aTime) {

		Time tm = new Validator().validate(aTime);

		return processTime(tm).toString();
	}

	/**
	 * Processes Time Object to Berlin Time.
	 * 
	 * @param tm
	 *            Time string in HH:mm:ss format
	 * @return Berlin Time string.
	 */
	private StringBuilder processTime(Time tm) {
		StringBuilder result = new StringBuilder();

		result.append(new SecondTimeUnit().convertTime(tm.getSeconds()))
				.append(Constants.NEW_LINE);
		result.append(new HoursTimeUnit().convertTime(tm.getHour())).append(
				Constants.NEW_LINE);
		result.append(new MinuteTimeUnit().convertTime(tm.getMinutes()));

		return result;
	}
}
