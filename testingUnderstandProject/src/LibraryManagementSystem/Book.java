package LibraryManagementSystem;

import java.util.Date;

/**
 * Book class for the book details
 * 
 * @author ramya
 */
public class Book {

	/** Variable declaration **/
	private int isbnNumber;
	private String bookTitle;
	private String authorName;
	private Date publishDate;
	private String bookGenre;
	private boolean availabilityStatus;

	public Book(int isbn, String author, String title, String bookGenre, Date publishDate) {
		this.isbnNumber = isbn;
		this.authorName = author;
		this.bookTitle = title;
		this.bookGenre = bookGenre;
		this.publishDate = publishDate;
		this.availabilityStatus = true;
	}

	public int getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBooktTitle(String booktTitle) {
		this.bookTitle = booktTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public boolean isAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

}
