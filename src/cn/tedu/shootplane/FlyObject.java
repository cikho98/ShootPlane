package cn.tedu.shootplane;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class FlyObject {
    private int width;
    private int height;
    private int x;
    private int y;
    private int speed;
    Random rand = new Random();

    public FlyObject(int width, int height){
        this.width=width;
        this.height=height;
        x = rand.nextInt(World.WIDTH-width);
        y=-height;
        speed=rand.nextInt(3)+1;
    }

    public FlyObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void move();

    public abstract ImageIcon getImage();

    public void paintImage(Graphics g){
        getImage().paintIcon(null,g,x,y);
    }

    public boolean isOutOfBounds(){
        return  y>=World.HEIGHT;
    }

}
