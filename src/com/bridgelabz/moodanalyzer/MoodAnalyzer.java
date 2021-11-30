package test.com.bridgelabz.moodanalyzer;

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
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		}else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		}
			return null;	
	}
}