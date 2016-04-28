package com.theinvader360.arenaroamer;

import com.badlogic.gdx.Game;

public class ArenaRoamer extends Game {

	public static final boolean DEBUG = false;
	public static final boolean RENDER_3D = false;
	public static final int WIDTH = 950;
	public static final int HEIGHT = 540;
	public GameScreen gameScreen;
	
	public void create() {
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}
}
