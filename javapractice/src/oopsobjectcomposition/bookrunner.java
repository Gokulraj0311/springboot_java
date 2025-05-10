package oopsobjectcomposition;

public class bookrunner {
	public static void main(String[] args) {
		book b = new book(123, "object oriented programming using java", "Ranga");
		b.addReview(new Review(10, "Great", 5));
		b.addReview(new Review(101, "Awsome", 5));
		System.out.println(b);
	}
}
