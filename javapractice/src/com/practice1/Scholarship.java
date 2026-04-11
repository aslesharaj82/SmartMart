package com.practice1;

import java.util.Scanner;

public class Scholarship {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Attendance percentage:");
		double Attendance = sc.nextInt();
		System.out.println("Enter Score of the student in Exam:");
		double Score = sc.nextInt();
		if (Attendance >= 75 && Score >= 60) {
			System.out.println("Eligible for Scholarship");
		} else {
			System.out.println("NOt Eligible for Scholarship");
		}

	}

}
