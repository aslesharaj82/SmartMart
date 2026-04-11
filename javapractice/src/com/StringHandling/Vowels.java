package com.StringHandling;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String:");
		String n=sc.nextLine();
		
		int count=0;
		String vowels="";
		String consonents="";
		for(int i=0;i<n.length();i++) {
			count++;
			char s=n.charAt(i);
			
			if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U') {
			
				vowels=vowels+s;
			
			}
			else {
				 consonents=consonents+s;
			}
		}
		System.out.println("Word count: "+count);
		System.out.println("Vowels: "+ vowels);
		System.out.println("Consonents: "+consonents);

	}

}
