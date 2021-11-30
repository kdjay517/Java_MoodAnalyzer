package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {
	

    static MoodAnalyzer moodAnalyzer;

	@BeforeClass
	public static void init() {
		moodAnalyzer = new MoodAnalyzer();
	}
	
	@Test

	public void givenMessage_WhenSad_ShouldReturnSad() {
		moodAnalyzer.setMessage("Iam in Happy Mood");
		String result = moodAnalyzer.readMessage();
		Assert.assertEquals("HAPPY",result);
		System.out.println("Iam in Happy Mood");
	}
}