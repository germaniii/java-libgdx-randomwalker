package com.germaniii.randomwalker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.germaniii.randomwalker.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Random Walker";
		config.height = 600;
		config.width = 800;
		new LwjglApplication(new Main(), config);
	}
}
