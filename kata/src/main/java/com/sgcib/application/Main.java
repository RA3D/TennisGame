package com.sgcib.application;

import com.sgcib.core.Game;
import com.sgcib.core.KataGame;
import com.sgcib.core.Player;

public class Main {
	
	public static void main(String[] args) {
		
		Player nadal = new Player("Nadal");
		Player federer = new Player("Federer");
		
		Game game = new KataGame(nadal, federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(nadal);
		game.score(federer);
		game.score(federer);
		game.score(federer);
		game.score(nadal);
		game.score(nadal);
		game.score(nadal);
		game.score(nadal);
		
		
	}

}
