package com.capgemini.files.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization 
{
	 public void doSerialization(Object obj, String filePath) throws IOException
	 {
		                                                                                                      
			   FileOutputStream fileOutputStream = new FileOutputStream(filePath);                  
			   ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);                      
			   objectOutputStream.writeObject(obj);                                                                                                                      
			   objectOutputStream.close();   
			   fileOutputStream.close();
		  
		       
	 }
}
