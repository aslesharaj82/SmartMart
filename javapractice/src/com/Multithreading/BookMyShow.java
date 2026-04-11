package com.Multithreading;

import java.util.Scanner;

class TicketBooking {
	int TotalTickets = 10;

	public synchronized void bookmyTickets(String UserName,int requestedTickets) {

		if (requestedTickets <= TotalTickets) {
			System.out.println(UserName+" Your " + requestedTickets + " Tickets Booked Successfully!!!");
			TotalTickets = TotalTickets - requestedTickets;
			System.out.println("Remaining Tickets are: " + TotalTickets);
		} else {
			System.out.println("Sorry Tickets have sold out...." + "\n" + " Available Tickets are:" + TotalTickets);
		}

	}

}

class User extends Thread {
	int requestedTickets;
	TicketBooking booking;
	String userName;

	User(TicketBooking booking, String userName, int requestedTickets) {
		this.requestedTickets = requestedTickets;
		this.booking = booking;
		this.userName = userName;
	}

	public void run() {
		booking.bookmyTickets(userName,requestedTickets);
	}
}

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		TicketBooking booking = new TicketBooking();
		while (true) {
			System.out.println("Enter your Name:");
			String name = sc.nextLine();
		
			System.out.println("Select the number of seats requried: ");
			int requestedTickets = sc.nextInt();
			sc.nextLine();
			User user1 = new User(booking, name, requestedTickets);

			user1.start();
			user1.join();
			System.out.println("Do you want to continue...?(yes/no)");
			String n=sc.nextLine();
			if(n.equalsIgnoreCase("no")) {
				
				break;
				
			}
		}
		sc.close();
	}

}
