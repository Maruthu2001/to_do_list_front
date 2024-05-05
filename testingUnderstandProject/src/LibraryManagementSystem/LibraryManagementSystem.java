package LibraryManagementSystem;

import java.util.Date;
import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		System.out.println("//***   Welcome to library management System   ***//");
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		while (true) {
			System.out.println(
					"\n1)Add book\n2)Remove book\n3)Get book details\\n4)Update book details\n5)Add member\n6)Remove member\n7)Get member details\n8)Update member details\n9)Borrow book\n10)Return book\n11)Exit");
			int operation = sc.nextInt();
			int bookNumber = 0, memId = 0;
			String bookTitle = "", authorName = "", genre = "", memName = "", conInfo = "";
			switch (operation) {
			case 1:
				System.out.println("Enter the book number");
				bookNumber = sc.nextInt();
				System.out.println("Enter the book title");
				bookTitle = sc.next();
				System.out.println("Enter the book author");
				authorName = sc.next();
				System.out.println("Enter the book genre");
				genre = sc.next();
				Book book = new Book(bookNumber, bookTitle, authorName, genre, new Date());
				library.addBook(book);
				System.out.println("\nBook added successfully");
				break;
			case 2:
				System.out.println("Enter the book number");
				bookNumber = sc.nextInt();
				library.removeBook(bookNumber);
				break;
			case 3:
				System.out.println("Enter the book number");
				bookNumber = sc.nextInt();
				library.getBookDetails(bookNumber);
				break;
			case 4:
				System.out.println("Enter the book number");
				bookNumber = sc.nextInt();
				System.out.println("Enter the book title");
				bookTitle = sc.next();
				System.out.println("Enter the book author");
				authorName = sc.next();
				System.out.println("Enter the book genre");
				genre = sc.next();
				library.updateBook(bookNumber, authorName, bookTitle, genre);
				break;
			case 5:
				System.out.println("Enter the member id");
				memId = sc.nextInt();
				System.out.println("Enter the member name");
				memName = sc.next();
				System.out.println("Enter the info");
				conInfo = sc.nextLine();
				Member member = new Member(memId, memName, conInfo);
				library.addMember(member);
				System.out.println("\nmember added successfully");
				break;
			case 6:
				System.out.println("Enter the member id");
				memId = sc.nextInt();
				library.removeMember(memId);
				break;
			case 7:
				System.out.println("Enter the member id");
				memId = sc.nextInt();
				library.getMemberDetails(memId);
				break;
			case 8:
				System.out.println("Enter the member id");
				memId = sc.nextInt();
				System.out.println("Enter the member name");
				memName = sc.next();
				System.out.println("Enter the info");
				conInfo = sc.nextLine();
				library.updateMember(memId, memName, conInfo);
				break;
			case 9:
				System.out.println("Enter the book number");
				bookNumber = sc.nextInt();
				System.out.println("Enter the member id");
				memId = sc.nextInt();
				library.borrowBook(bookNumber, memId);
				break;
			case 10:
				System.out.println("Enter the book number");
				bookNumber = sc.nextInt();
				library.removeBook(bookNumber);
				break;
			case 11:
				System.out.println("Exited....");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("\nEnter the valid operation");
				break;
			}
		}
	}
}
