package com.in28minutes.gokul;

import com.in28minutes.gokul.game.GameRunner;
import com.in28minutes.gokul.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// var game = new MarioGame();
		var game = new PacmanGame();
		var gamerunner = new GameRunner(game);
		gamerunner.run();

	}

}
