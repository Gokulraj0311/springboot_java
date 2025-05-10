package encapsulation;

public class hello {
	public static void main(String args[]) {
		runner s = new runner(500);
		s.increade(500);
		System.out.println(s.getSpeed());
	}
}
