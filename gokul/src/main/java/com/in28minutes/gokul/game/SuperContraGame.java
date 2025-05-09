package com.in28minutes.gokul.game;

public class SuperContraGame implements GamingConsole {
	@Override
	public void right() {
		System.out.println("Shoot bullet");

	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

	@Override
	public void up() {
		System.out.println("go up");

	}

	@Override
	public void down() {
		System.out.println("Sit down");

	}
}
