package com.germaniii.randomwalker;

public class Circle {

    float x, y;

    public Circle(){
        x = 0;
        y = 0;
    }

    public Circle(float xpos, float ypos){
        x = xpos;
        y = ypos;

    }

    public void add(float xpos, float ypos){
        x = xpos;
        y = ypos;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }


}
