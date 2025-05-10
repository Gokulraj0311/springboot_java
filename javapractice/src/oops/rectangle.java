package oops;

public class rectangle {
	private double length;
	private double width;

	public rectangle(double width, double length) {

		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return String.format("width-%f,length-%f,area--%f,perimeter--%f", width, length, area(), perimeter());
	}

}
