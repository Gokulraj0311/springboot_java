package wrapperandstring;

public class stringlonglength {
	public static void main(String args[]) {
		String s = "i brought a apple of thing in it programming";
		System.out.println(isnumberic(s));

	}

	public static String isnumberic(String s) {
		if (s == null || s.equals("")) {
			return "";
		}
		String[] words = s.split(" ");
		int max = 0;
		String longword = "";
		for (String word : words) {
			if (word.length() > max) {
				max = word.length();
				longword = word;
			}
		}
		return longword;
	}
}
