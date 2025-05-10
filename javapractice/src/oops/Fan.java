package oops;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean ison;
	private int speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void seton() {
		this.ison = true;
	}

	public void setoff() {
		this.ison = false;
		setspeed(0);
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("make-%s,radius-%f,color-%s,isOn-%b,speed-%d", make, radius, color, ison, speed);
	}

}
