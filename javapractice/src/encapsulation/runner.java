package encapsulation;

class runner {
	private int speed;

	runner(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increade(int howmuch) {
		setSpeed(this.speed + howmuch);
	}

	public void decrease(int howmuch) {
		setSpeed(this.speed - howmuch);
	}

}
