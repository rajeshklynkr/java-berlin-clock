package com.ubs.opsit.interviews.vo;

public class Time {
	private final int hour;
	private final int minutes;
	private final int seconds;

	public Time(int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minutes=" + minutes + ", seconds="
				+ seconds + "]";
	}

}
