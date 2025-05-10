package oopsobjectcomposition;

import java.util.ArrayList;

public class book {
	private int bookno;
	private String bookname;
	private String student;
	private ArrayList<Review> reviews = new ArrayList<>();

	public book(int bookno, String bookname, String student) {

		this.bookno = bookno;
		this.bookname = bookname;
		this.student = student;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id=%d name=%s author=%s Reviews=[%s]", bookno, bookname, student, reviews);
	}
}
