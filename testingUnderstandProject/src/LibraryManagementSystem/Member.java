package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Member class for the member details
 * 
 * @author ramya
 */

public class Member {

	/** Variable declaration **/
	private int memberId;
	private String memberName;
	private String memberContactInfo;
	private List<Book> bookBorrowingHistory;

	public Member(int memberId, String name, String contactInfo) {
		this.memberId = memberId;
		this.memberName = name;
		this.memberContactInfo = contactInfo;
		this.bookBorrowingHistory = new ArrayList<>();
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberContactInfo() {
		return memberContactInfo;
	}

	public void setMemberContactInfo(String memberContactInfo) {
		this.memberContactInfo = memberContactInfo;
	}

	public List<Book> getBookBorrowingHistory() {
		return bookBorrowingHistory;
	}

	public void setBookBorrowingHistory(Book book) {
		this.bookBorrowingHistory.add(book);
	}

	public void returnBookBorrowingHistory(Book book) {
		this.bookBorrowingHistory.remove(book);
	}

}
