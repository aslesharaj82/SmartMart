package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Are you Attending the classes...?");
        boolean areYouattendingtheclasses=sc.nextBoolean();
        
        System.out.println("Are you completeing the Assignments...?");
        boolean areYoucompletingtheassignment=sc.nextBoolean();
        
        System.out.println("Areypu Attending the weekly Exams...?");
        boolean areYouattendingWeeklyExams=sc.nextBoolean();
        
        System.out.println("Areypu Attending the mOck inteviews...?");
        boolean areYouattendingMockInterviews=sc.nextBoolean();
        
        if (areYouattendingtheclasses && areYoucompletingtheassignment && areYouattendingWeeklyExams && areYouattendingMockInterviews) {
        	System.out.println("you will  get a job in 6 Months");
        }else
        	System.out.println("Pray to God");
	}

}
