package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication 
{
	public int checkWordCount() throws IOException
	{
		int count = 0;
		FileReader reader = new FileReader("C:\\Core Java\\Basic_assignments\\src\\Array.java");
		BufferedReader breader = new BufferedReader(reader);
		
		String content;
		while ((content=breader.readLine()) != null)
		{
			String s[] = content.split("\\s+");
			count = count + s.length;
		}
		System.out.println("Words Counted successfully");
		breader.close();
		reader.close();
		return count;
	}
}
