package com.battmenstudios.schmelda.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.battmenstudios.schmelda.Schmelda;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Schmelda.WIDTH;
		config.height = Schmelda.HEIGHT;
		config.title = Schmelda.TITLE;

		new LwjglApplication(new Schmelda(), config);
	}
}
