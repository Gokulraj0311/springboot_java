package ArrayandArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.remove(0);
		System.out.println(list);
		ArrayList<Integer> marks = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			marks.add(sc.nextInt());
		}
		System.out.println(getmax(marks));
		System.out.println(getmin(marks));
		sc.close();
	}

	public static int getmax(List<Integer> marks) {
		return Collections.max(marks);
	}

	public static int getmin(List<Integer> marks) {

		return Collections.min(marks);
	}

}
