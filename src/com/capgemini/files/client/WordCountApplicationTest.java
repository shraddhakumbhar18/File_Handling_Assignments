package com.capgemini.files.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.WordCountApplication;

public class WordCountApplicationTest 
{

	@Test
	public void testForCountingWords() throws IOException 
	{
		WordCountApplication wordCount = new WordCountApplication();
		assertEquals(86, wordCount.checkWordCount());
	}

}
