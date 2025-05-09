package com.in28minutes.gokul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.gokul.game.GameRunner;
import com.in28minutes.gokul.game.GamingConsole;
import com.in28minutes.gokul.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gamerunner = new GameRunner(game);
		return gamerunner;
	}
}
