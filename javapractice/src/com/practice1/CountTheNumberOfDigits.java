package com.practice1;

import java.util.Scanner;

public class CountTheNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:- ");
		int number = sc.nextInt();
		CountTheNumberOfDigits e = new CountTheNumberOfDigits();
		e.hello(number);
	}

	void hi(int n, int digit) {

		int count = 0;
		// System.out.println(n+" "+digit);

		for (; n > 0; n = n / 10) {
			// System.out.println("number:"+n);
			int rem = n % 10;
			// System.out.println("rem:-"+rem);
			if (digit == rem) {
				count++;
				// System.out.println("count:- "+count);
			}
		}
		System.out.println("Digit:" + digit + " " + "count" + count);
	}

	void hello(int number) {
		int original = number;
		for (; number > 0; number = number / 10) {
			int digit = number % 10;
			int t;
			for (t = original; t > number; t = t / 10) {
				if (t % 10 == digit) {

					break;
				}

			}
			if (t <= number)
				hi(original, digit);

		}
	}

}
