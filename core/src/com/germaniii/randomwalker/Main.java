package com.germaniii.randomwalker;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Random;

public class Main extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;
	Random rand = new Random();

	float circleX = 200;
	float circleY = 100;

	float xSpeed = 60;
	float ySpeed = 60;
	
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
	}

	@Override
	public void render () {
		ScreenUtils.clear((float).5, (float).5, (float).5, 1);

		// randomly move x, y
		circleX += xSpeed * Gdx.graphics.getDeltaTime() * ((rand.nextInt(3)) - 1);
		circleY += ySpeed * Gdx.graphics.getDeltaTime() * ((rand.nextInt(3)) - 1);

		// Bounds conditions for X
		if(circleX < 0){
			circleX = 0;
		}
		if(circleX > Gdx.graphics.getWidth()){
			circleX = Gdx.graphics.getWidth();
		}
		// Bounding conditions for Y
		if(circleY < 0){
			circleY = 0;
		}
		if(circleY > Gdx.graphics.getWidth()){
			circleY = Gdx.graphics.getWidth();
		}

		// Render Circle
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(0, 1, 0, 1);
		shapeRenderer.circle(circleX, circleY, 3);
		shapeRenderer.end();
	}
	
	@Override
	public void dispose () {
	}
}
