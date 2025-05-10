package wrapperandstring;

public class consecutivechar {

	public static void main(String[] args) {
		String s = "HHHHa";
		System.out.println(hasconsecutive(s));

	}

	public static boolean hasconsecutive(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			char currentchar = s.charAt(i);
			char nextchar = s.charAt(i + 1);
			if (currentchar == nextchar) {
				return true;
			}
		}
		return false;
	}

}
