package wrapperandstring;

public class countuppercase {
	public static void main(String args[]) {
		String s = "Hello World";
		System.out.println(countupper(s));
	}

	public static int countupper(String s) {
		if (s == null) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
