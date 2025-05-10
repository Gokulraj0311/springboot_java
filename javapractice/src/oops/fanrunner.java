package oops;

public class fanrunner {
	public static void main(String[] args) {
		Fan fan = new Fan("manufacture", 0.5, "blue");
		System.out.println(fan);
		fan.seton();
		fan.setspeed(5);
		System.out.println(fan);
		fan.setoff();
		System.out.println(fan);

	}

}
