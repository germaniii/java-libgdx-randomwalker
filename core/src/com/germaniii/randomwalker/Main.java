package com.germaniii.randomwalker;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Main extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;
	Random rand = new Random();
	float circleX = 200;
	float circleY = 100;
	float r, g, b;
	ArrayList<Circle> circle;

	float xSpeed = 120;
	float ySpeed = 120;
	
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		circle = new ArrayList<>();
	}

	@Override
	public void render () {
		ScreenUtils.clear((float).5, (float).5, (float).5, 1);

		// randomly move x, y
		circleX += xSpeed * Gdx.graphics.getDeltaTime() * ((rand.nextInt(3)) - 1);
		circleY += ySpeed * Gdx.graphics.getDeltaTime() * ((rand.nextInt(3)) - 1);
		r = (float) Math.random();
		g = (float) Math.random();
		b = (float) Math.random();


		circle.add(new Circle(circleX, circleY, r, g, b));

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
		for (Circle iter : circle) {
			shapeRenderer.setColor(iter.getR(),iter.getG(), iter.getB(), 1);
			shapeRenderer.circle(iter.getX(), iter.getY(), 3);
		}

		shapeRenderer.end();
	}
	
	@Override
	public void dispose () {
		shapeRenderer.dispose();
	}
}
