package com.germaniii.randomwalker;

public class Circle {

    float x, y, r, g, b;

    public Circle(){
        x = 0;
        y = 0;
    }

    public Circle(float xpos, float ypos, float rc, float gc, float bc){
        x = xpos;
        y = ypos;
        r = rc;
        g = gc;
        b = bc;

    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float getR(){
        return r;
    }

    public float getG(){
        return g;
    }

    public float getB(){
        return b;
    }


}
