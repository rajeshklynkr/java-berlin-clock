package com.ubs.opsit.interviews.validator;

import com.ubs.opsit.interviews.constant.Constants;
import com.ubs.opsit.interviews.vo.Time;

public class Validator {

	/**
	 * Validates given string as a {@link Time}.
	 * 
	 * @param time
	 *            time string in HH:mm:ss format
	 * @return returns a {@link Time} object presenting given string.
	 */
	public Time validate(String time) {
		Preconditions.validate(time != null, Constants.NO_TIME_ERROR);

		String[] times = time.split(":", 3);

		Preconditions.validate(times.length == 3, Constants.INVALID_TIME_ERROR);

		int hours = 0, minutes = 0, seconds = 0;

		try {
			hours = Integer.parseInt(times[0]);
			minutes = Integer.parseInt(times[1]);
			seconds = Integer.parseInt(times[2]);
		} catch (NumberFormatException e) {
			Preconditions.validate(false, Constants.NUMERIC_TIME_ERROR);
		}

		if (hours < 0 || hours > 24)
			Preconditions.validate(false, Constants.HOURS_OUT_OF_BOUNDS);
		if (minutes < 0 || minutes > 60)
			Preconditions.validate(false, Constants.MINUTES_OUT_OF_BOUNDS);
		if (seconds < 0 || seconds > 60)
			Preconditions.validate(false, Constants.SECONDS_OUT_OF_BOUNDS);

		return new Time(hours, minutes, seconds);
	}
}
