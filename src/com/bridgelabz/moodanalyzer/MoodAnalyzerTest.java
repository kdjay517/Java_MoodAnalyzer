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
		moodAnalyzer.setMessage("Iam in Sad Mood");
		String result;
		try {
			result = moodAnalyzer.readMessage();
			Assert.assertEquals("SAD", result);
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Iam in Sad Mood");
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		moodAnalyzer.setMessage("Iam in Happy Mood");
		String result;
		try {
			result = moodAnalyzer.readMessage();
			Assert.assertEquals("HAPPY", result);
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Iam in Happy Mood");
	}

	@Test
	public void givenMessage_Null_ShouldReturnExceptionHandled() {
		moodAnalyzer.setMessage(null);
		String result;
		try {
			result = moodAnalyzer.readMessage();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.readMessage();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}

