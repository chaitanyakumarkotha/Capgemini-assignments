package com.capgemini.lab6.exercise7;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileDetails {
	 public void filesdetails()
	 {
		 Path path = Paths.get("D:\\01 Training\\Gaurav Vasasali\\Java Assignments\\Lab6_Excercise2.txt");
		 boolean bool = Files.isReadable(path);
		 if(bool)
		 {
			 System.out.println("is readable");
		 }
		 else 
		 {
			 System.out.println("not readable");
		 }
		 boolean bool1 = Files.isExecutable(path);
		 if(bool)
		 {
			 System.out.println("is Executable");
		 }
		 else 
		 {
			 System.out.println("not Executable");
		 }
		 boolean bool2 = Files.isWritable(path);
		 if(bool)
		 {
			 System.out.println("is Writable");
		 }
		 else 
		 {
			 System.out.println("not Writable");
		 }
		 
		 
		 
		 
	 }
			 
}
