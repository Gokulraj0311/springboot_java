package ArrayandArrayList;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] marks = { 70, 60, 56, 80, 90 };
		// foreach
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		int len = marks.length;
		System.out.println("maximum mark:" + getmax(marks));
		System.out.println("minimum mark:" + getmin(marks));
		System.out.println("Total marks:" + sum);
		System.out.println("Average marks:" + sum / len);
		System.out.println(Arrays.toString(marks));
	}

	public static int getmax(int[] marks) {
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public static int getmin(int[] marks) {
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

}
