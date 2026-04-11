package com.practice1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {

	public static void main(String[] args) {
		Random randomNumber= new Random(); 
		 int r=randomNumber.nextInt(10);
		System.out.println(r);
		Guess(r);
	}
		static void Guess(int r) {
			Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("enter a number: ");
			int number=sc.nextInt();
			
			if (r==number) {
				System.out.println("Congrats...!! You Won.");
				break;
			}else if (i!=3){
				System.out.println("Your guess is wrong.Try again");
			}
			if (i==3) {
				System.out.println("You lost");
				}
			
		}
		
	}

}
