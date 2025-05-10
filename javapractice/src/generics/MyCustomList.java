package generics;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
	ArrayList<T> ss = new ArrayList<>();

	public void addElement(T element) {

		ss.add(element);
	}

	public void removeElement(T element) {
		ss.remove(element);
	}

	@Override
	public String toString() {
		return ss.toString();
	}

	public T get(int index) {

		return ss.get(index);
	}
}
