package com.sgcib.core;

/**
 * Manage a tennis GAME within a set of a tennis match.
 * 
 * @author Zakariae
 *
 */
public interface Game {
	
	/**
	 * Display the current Game score of each player.
	 * @return
	 */
	public String getScore();
	
	
	/**
	 * Score new point.
	 * 
	 * @param player
	 */
	public void score(Player player);

}