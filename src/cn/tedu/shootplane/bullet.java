package cn.tedu.shootplane;

import javax.swing.*;

public class bullet extends FlyObject {

    public bullet(int x, int y) {
        super(8, 20, x, y, 2);
    }

    @Override
    public void move() {
        setY(getY()+getSpeed());
    }

    @Override
    public ImageIcon getImage() {
        return null;
    }

    @Override
    public boolean isOutOfBounds() {
        return getY()<=0;
    }
}
