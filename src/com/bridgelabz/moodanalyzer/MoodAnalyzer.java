package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String readMessage() {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "Exception Handled";
		}
	}
}