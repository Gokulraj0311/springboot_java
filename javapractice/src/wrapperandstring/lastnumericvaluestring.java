package wrapperandstring;

public class lastnumericvaluestring {
	public static void main(String args[]) {
		String s = "i 1 2 brought a apple of 5 thing in it";
		System.out.println(isnumberic(s));

	}

	public static int isnumberic(String s) {
		if (s == null || s == "") {
			return -1;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
			}
		}
		return -1;
	}
}
