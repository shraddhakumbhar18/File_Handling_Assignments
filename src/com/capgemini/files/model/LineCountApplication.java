package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication 
{
	public int checkLineCount() throws IOException
	{
		FileReader reader = new FileReader("C:\\Core Java\\Basic_assignments\\src\\Array.java");
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		while (breader.readLine() != null)
		{
			count++;
		}
		System.out.println("Line Counted successfully");
		breader.close();
		reader.close();
		return count;
	}
}
