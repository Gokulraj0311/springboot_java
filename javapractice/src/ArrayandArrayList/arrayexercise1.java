package ArrayandArrayList;

public class arrayexercise1 {

	public static void main(String[] args) {
		String[] arr = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String daymostchar = "";
		for (String day : arr) {
			if (day.length() > daymostchar.length()) {
				daymostchar = day;
			}
		}
		System.out.println("Day with most number of character:" + daymostchar);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
