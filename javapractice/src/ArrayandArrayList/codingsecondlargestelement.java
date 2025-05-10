package ArrayandArrayList;

public class codingsecondlargestelement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 30000, 4, 900, 5000 };
		System.out.println(secondlarge(arr));
	}

	public static int secondlarge(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int largestElement = Integer.MIN_VALUE;// 0
		int secondlargestElement = Integer.MIN_VALUE;// 0
		for (int arrr : arr) {
			if (arrr > largestElement) {
				secondlargestElement = largestElement;
				largestElement = arrr;
			} else if (arrr > secondlargestElement) {
				secondlargestElement = arrr;
			}
		}
		return secondlargestElement;
	}

}
