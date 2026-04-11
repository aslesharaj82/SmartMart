package com.ExceptionHandleing;

import java.io.File;
import java.io.IOException;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		File fr = new File("S:\\Users\\Tnluser\\Downloads\\Exception1\\Aslesha1.txt");
		try {
			System.out.println("Hello1");

			fr.createNewFile();// Unhandle ExceptionTYpe IOException
		} catch (IOException e) {
			System.out.println("Exception catched");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("method ended");
	}

}
