package com.Logicalstatements;

import java.util.Scanner;

public class HrConvo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hr:- Hi..! I am Rose calling form Google company");
		System.out.println("Is this Aslesha..?");
		String n=sc.nextLine();
		if(n.equals("yes")) {
			System.out.println("Ok Aslesha..! I Saw your Profile in Naukari ");
			System.out.println("Are u looking for a Job..?");
			String q=sc.nextLine();
			if(q=="yes") {	
				System.out.println("We have a vancancy in our company for Associate Software role."+"\n"+"Are you Intrested.?");
				String r=sc.next();
				if (r.equals("yes")) {
					System.out.println("Ok...! May i know your Highest Qualification..?Are M.tech or B.tech");
					String z=sc.nextLine();
					}else {
						System.out.println("Ok Thank you ");
					}
				}
			else
			{
				System.out.println("Ok Aslesha Thank you for conforming");
			}
		}
		else
		{
			System.out.println("Ok, I will check the profile Once again");
		}
	}
}

