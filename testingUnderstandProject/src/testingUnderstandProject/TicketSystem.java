package testingUnderstandProject;

import java.util.Scanner;

class Ticket{
	private int seatNumber;
	private boolean book;
	
	public Ticket(int seatNumber) {
		this.seatNumber = seatNumber;
		this.book = false;
	}
	
	public int getSeatNumber() {
		return this.seatNumber;
	}
	
	public boolean isBooked() {
		return this.book;
	}
	
	public void bookTicket() {
		this.book = true;
		System.out.println("Ticket booked");
	}
	
	public void cancelTicket() {
		this.book = false;
		System.out.println("Ticket canceled");
	}
}

class TicketManagement{
	private static int totalSeats = 10;
    Ticket[] tickets;
	
	
	public TicketManagement() {
		tickets = new Ticket[totalSeats];
		for(int i =0;i<totalSeats;i++) {
			tickets[i] = new Ticket(i+1);
		}
	}
	
	public void getAvailableSeats() {
		for(Ticket ticket : tickets) {
			if(!ticket.isBooked()) {
				System.out.print(ticket.getSeatNumber() +" ");
			}
		}
		System.out.println();
	}
	
	public void ticketBook(int seatNumber) {
		if(seatNumber <=0 && seatNumber > this.totalSeats) {
			System.out.println("Invalid Seat Number");
			return;
		} 
		Ticket ticket = tickets[seatNumber-1];
		if(!ticket.isBooked()) {
			System.out.println("Ticket is booked");
			ticket.bookTicket();
		} else {
			System.out.println("Ticket is already booked");
		}
	}

	public void ticketCancel(int seatNumber) {
		if(seatNumber <=0 && seatNumber > this.totalSeats) {
			System.out.println("Invalid Seat Number");
			return;
		} 
		Ticket ticket = tickets[seatNumber-1];
		if(ticket.isBooked()) {
			System.out.println("Ticket is canceled");
			ticket.cancelTicket();
		} else {
			System.out.println("Ticket is not booked yet");
		}
	}
}

public class TicketSystem {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		TicketManagement tm = new TicketManagement();
		
		while(true) {
			System.out.println("1. Display available seats");
            System.out.println("2. Book a ticket");
            System.out.println("3. Cancel booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	tm.getAvailableSeats();
                    break;
                case 2:
                    System.out.print("Enter seat number to book: ");
                    int bookSeat = sc.nextInt();
                    tm.ticketBook(bookSeat);
                    break;
                case 3:
                    System.out.print("Enter seat number to cancel booking: ");
                    int cancelSeat = sc.nextInt();
                    tm.ticketCancel(cancelSeat);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
		}
	}
}
