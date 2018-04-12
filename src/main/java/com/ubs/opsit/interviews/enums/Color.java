package com.ubs.opsit.interviews.enums;

public enum Color {

	RED("R"), YELLOW("Y");

	private String color;

	Color(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color;
	}
}
