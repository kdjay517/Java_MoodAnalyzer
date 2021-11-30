package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	public String readMessage(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		}else
			return null;	
	}
}
