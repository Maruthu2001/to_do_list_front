package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Library class for the library details
 * 
 * @author ramya
 */

public class Library {

	/** Variables declaration **/
	private List<Book> books;
	private List<Member> members;
	private Map<Book, Member> transactions;

	public Library() {
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
		this.transactions = new HashMap<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(int isbnNumber) {
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			Book bookk = iterator.next();
			if (bookk.getIsbnNumber() == isbnNumber) {
				System.out.println("Book removed successfully");
				iterator.remove();
				return;
			}
		}
		System.out.println("Book isbnNumber number is not found");
	}

	public void addMember(Member member) {
		members.add(member);
	}

	public void removeMember(int memberId) {
		Iterator<Member> iterator = members.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			if (member.getMemberId() == memberId) {
				System.out.println("Member removed successfully");
				iterator.remove();
				return;
			}
		}
		System.out.println("Member ID is not found");

	}

	public void getBookDetails(int isbnNumber) {
		Iterator<Book> bookiterator = books.iterator();
		while (bookiterator.hasNext()) {
			Book book = bookiterator.next();
			if (book.getIsbnNumber() == isbnNumber) {
				System.out.println(
						"Author" + book.getAuthorName() + "Title" + book.getBookTitle() + "Genre" + book.getBookGenre()
								+ "PublishDate" + book.getPublishDate() + "Availablity" + book.isAvailabilityStatus());
			}
		}
		System.out.println("Book is not available");
	}

	public void getMemberDetails(int memberId) {
		Iterator<Member> memberiterator = members.iterator();
		while (memberiterator.hasNext()) {
			Member member = memberiterator.next();
			if (member.getMemberId() == memberId) {
				System.out.println(
						"Member Name" + member.getMemberName() + "Contact Info" + member.getMemberContactInfo());
			}
		}
		System.out.println("Member is not available");
	}

	public void updateBook(int isbnNumber, String author, String title, String bookGenre) {
		Iterator<Book> bookiterator = books.iterator();
		while (bookiterator.hasNext()) {
			Book book = bookiterator.next();
			if (book.getIsbnNumber() == isbnNumber) {
				book.setAuthorName(author);
				book.setBooktTitle(title);
				book.setBookGenre(bookGenre);
				book.setPublishDate(new Date());
				System.out.println("updated Successfully..");
			}
		}
		System.out.println("Book is not available for Updating");
	}

	public void updateMember(int memberId, String name, String contactInfo) {
		Iterator<Member> memberiterator = members.iterator();
		while (memberiterator.hasNext()) {
			Member member = memberiterator.next();
			if (member.getMemberId() == memberId) {
				member.setMemberContactInfo(contactInfo);
				member.setMemberName(name);
				System.out.println("Updated Successfully..");
			}
		}
		System.out.println("Member is not available for updating");
	}

	public void borrowBook(int isbnNumber, int memberId) {
		Iterator<Book> bookiterator = books.iterator();
		Iterator<Member> memberiterator = members.iterator();
		while (bookiterator.hasNext()) {
			Book book = bookiterator.next();
			if (book.getIsbnNumber() == isbnNumber) {
				if (book.isAvailabilityStatus()) {
					book.setAvailabilityStatus(false);
					while (memberiterator.hasNext()) {
						Member member = memberiterator.next();
						if (member.getMemberId() == memberId) {
							member.setBookBorrowingHistory(book);
							transactions.put(book, member);
							System.out.println("Book borrowed by " + member.getMemberName());
							return;
						}
					}
					return;
				}
			}
		}
		System.out.println("Book is not available for borrowing");
	}

	public void returnBook(int isbnNumber) {
		Iterator<Book> bookiterator = books.iterator();
		while (bookiterator.hasNext()) {
			Book book = bookiterator.next();
			if (transactions.containsKey(book)) {
				Member member = transactions.get(book);
				member.returnBookBorrowingHistory(book);
				book.setAvailabilityStatus(false);
				transactions.remove(book);
				System.out.println("Book returned by " + member.getMemberName());
				return;
			}
		}
		System.out.println("Book was not borrowed");
	}
}
