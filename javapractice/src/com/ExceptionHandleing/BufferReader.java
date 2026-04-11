package com.ExceptionHandleing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) {
  try {
	FileReader r= new FileReader("C:\\Users\\Tnluser\\Downloads\\Exception1\\Aslesha1.txt");
	
	BufferedReader b= new BufferedReader(r);
	String t="";
	while((t=b.readLine())!=null) {
		System.out.println(t);
	}
  } catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
  }
	}

}
