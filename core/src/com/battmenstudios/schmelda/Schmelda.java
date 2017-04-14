package com.battmenstudios.schmelda;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.battmenstudios.schmelda.screens.MainMenuScreen;

public class Schmelda extends Game {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 480;
//	public static final float PPM = 100;
	public int currentLevel = 1;

	public static final String TITLE = "Schmelda";
	public SpriteBatch batch;

	//Default Chain Attributes
	public static final float DEFAULT_MOVEMENT_SPEED = 75;

	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainMenuScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();
	}

	@Override
	public void render () {
		super.render();
	}
}
