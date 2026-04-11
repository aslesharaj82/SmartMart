package com.ExceptionHandleing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readthefile {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\Tnluser\\Downloads\\Exception1\\Aslesha1.txt");
			BufferedReader r=new BufferedReader(f);

			try {
				int a = f.read();
				while (a != -1) {
					System.out.print((char) a);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
					a = f.read();
				}

				System.out.println("Successful");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("IO Exception Occured");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException occured");
		}

	}

}
