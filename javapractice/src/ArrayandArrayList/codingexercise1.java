package ArrayandArrayList;

import java.util.Scanner;

public class codingexercise1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(haslargestelement(arr, number));
		sc.close();

	}

	public static boolean haslargestelement(int[] arr, int number) {
		for (int array : arr) {
			if (array > number) {
				return true;
			}
		}
		return false;
	}
}
