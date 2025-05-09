package com.in28minutes.gokul.game;

public class PacmanGame implements GamingConsole {

	@Override
	public void right() {
		System.out.println("right");

	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

	@Override
	public void up() {
		System.out.println("up");
	}

	@Override
	public void down() {
		System.out.println("down");

	}

}
