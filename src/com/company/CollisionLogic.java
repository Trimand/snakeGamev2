package com.company;

import java.awt.*;

public class CollisionLogic {
    private int x, y, size;

    public CollisionLogic(int size) {
        this.size = size;
    }

    public int getX() {

        return x;

    }

    public int getY() {

        return y;

    }

    public void setX(int x) {

        this.x = x;

    }

    public void setY(int y) {

        this.y = y;

    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;

    }

    public Rectangle getBound() {

        return new Rectangle(x, y, size, size);
    }

    public boolean isCollsion(CollisionLogic o) {
        if (o == this) return false;
        return getBound().intersects(o.getBound());
    }

    public void render(Graphics2D g2d) {
        g2d.clearRect(x + 1, y + 1, size - 2, size - 2);
    }
}