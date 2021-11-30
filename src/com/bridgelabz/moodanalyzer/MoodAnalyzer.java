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

	 public String readMessage() throws MoodAnalysisException {
	        try {
	            if (message.length() == 0)
	                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
	            if (message.toLowerCase().contains("sad"))
	                return "SAD";
	            else
	                return "HAPPY";
	        } catch(NullPointerException e) {
	            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
	        }
	    }
}