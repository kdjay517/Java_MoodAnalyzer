package test.com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	public String readMessage(String message) {
		if (message.toLowerCase().contains("sad")) {
			return "SAD";
		}else
			return null;	
	}
}
