package com.theinvader360.arenaroamer;

import com.badlogic.gdx.Screen;

public class GameScreen implements Screen {

	private ArenaRoamer game;
	private World world;
	private WorldRenderer2D renderer2D;
	private WorldRenderer3D renderer3D;
	Servidor servidor;
	Thread t;
	
	public GameScreen(ArenaRoamer game) {
		servidor = new Servidor();
		t=new Thread(servidor);
		t.start();

		this.game = game;
		world = new World(game);
		renderer2D = new WorldRenderer2D(world);
		renderer3D = new WorldRenderer3D(world);
	}

	@Override
	public void render(float delta) {

		world.update(servidor.kari,servidor.dir);
		servidor.kari=0f;
		servidor.dir=0;
		if (ArenaRoamer.RENDER_3D) renderer3D.render();
		else renderer2D.render();

	}
	
	@Override public void resize(int width, int height) {}
	@Override public void show() {}
	@Override public void hide() {}
	@Override public void pause() {}
	@Override public void resume() {}
	@Override public void dispose() {}
}
