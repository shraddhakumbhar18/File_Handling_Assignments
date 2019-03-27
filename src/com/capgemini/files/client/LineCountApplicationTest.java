package com.capgemini.files.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LineCountApplication;

public class LineCountApplicationTest 
{
	@Test
	public void testForCountingLines() throws IOException 
	{
		LineCountApplication lineCount = new LineCountApplication();
		assertEquals(30, lineCount.checkLineCount());
	}
	
}
