package com.consoleproject;

import java.util.Scanner;

public class Tictaktoe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] a = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		char currentplayer = 'X';
		Board(a);
		boolean status = true;
		while (status) {
			boolean move = EnterValue(a, currentplayer,sc);
			if (move) {
				if (CheckWinner(a, currentplayer)) {
					System.out.println(currentplayer + "  wins!");
					if(PlayAgain(sc)) {
						ResetBoard(a);
						Board(a);
						currentplayer='X';
						status= true;
					}else        
					status=false;
				} else if(IsDraw(a)){
					System.out.println("The match is draw!!!");
					if(PlayAgain(sc)) {
						ResetBoard(a);
						Board(a);
						currentplayer='X';
						status= true;
					}else
					status=false;
				}
				else {
				
					currentplayer = (currentplayer == 'X') ? 'O' : 'X';
				}
			}
		}

	}
	static void ResetBoard(char[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=' ';
			}
		}
	}
	static boolean PlayAgain(Scanner sc) {
		System.out.println("Do you want to play again...?(yes/no) ");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes")) {
			return true;
		}
		return false;
		
	}

	static boolean IsDraw(char[][] a) {
		for(char[] n:a) {
			for(char n1:n) {
				if(n1==' ') {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean CheckWinner(char[][] a, char currentplayer) {
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] == currentplayer && a[i][1] == currentplayer && a[i][2] == currentplayer) {
				return true;
			} else if (a[0][i] == currentplayer && a[1][i] == currentplayer && a[2][i] == currentplayer) {
				return true;
			}
		}
		if (a[0][0] == currentplayer && a[1][1] == currentplayer && a[2][2] == currentplayer) {
			return true;
		} else if (a[0][2] == currentplayer && a[1][1] == currentplayer && a[2][0] == currentplayer) {
			return true;
		}

		return false;

	}

	static void Board(char[][] a) {
		System.out.println("----------");
		for (char[] a1 : a) {
			System.out.print("|");
			for (char a2 : a1) {
				System.out.print(a2 + " " + "|");
			}
			System.out.println();
			System.out.println("----------");
		}
	}

	static boolean EnterValue(char[][] a, char currentplayer,Scanner sc) {
		
		
		while(true) {
		System.out.println(currentplayer + " turn");
		int row=0;
		int column=0;
		try {
		System.out.println("enter the row number(0-2): ");
		row = sc.nextInt();
		System.out.println("enter the column number(0-2): ");
		column = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter the row/column numbers from 0-2!!");
			sc.nextLine();
			continue;
		}
		if(row < 0 || row > 2 || column < 0 || column > 2){
		    System.out.println("Invalid range! Enter between 0-2");
		    continue;
		}

		if (a[row][column] == ' ') {
			a[row][column] = currentplayer;
			Board(a);
		} else {
			System.out.println("position already filled");
			continue;
		}
		return true;
		}
	}

}
