package cn.tedu.shootplane;

import javax.swing.*;

public class Hero extends FlyObject {
    private int life;

    public int getLife() {
        return life;
    }


    public Hero() {
        super(97, 139, 200, 600, 2);
        life = 1;
    }


    @Override
    public void move() {

    }

    public void moveLeft() {
        setX(getX() - getSpeed());
    }

    public void moveRight() {
        setX(getX() + getSpeed());
    }

    public void moveUp() {
        setY(getY() + getSpeed());
    }

    public void movedown() {
        setY(getY() - getSpeed());
    }


    public void addLife(int num){
        life+=num;
    }

    public void subtractLife(){
        life--;
    }

    @Override
    public ImageIcon getImage() {
        return null;
    }
}
