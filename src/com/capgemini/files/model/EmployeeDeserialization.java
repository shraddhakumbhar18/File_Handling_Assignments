package com.capgemini.files.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization 
{
	public Object doDeSerialization(String filePath) throws IOException, ClassNotFoundException
	 {
		                                                                                                      
			   FileInputStream fileInputStream = new FileInputStream(filePath);                  
			   ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);                      
			   Object object = objectInputStream.readObject();                                                                                                                   
			   objectInputStream.close();   
			   fileInputStream.close();
			   return object;
		       
	 }
}
