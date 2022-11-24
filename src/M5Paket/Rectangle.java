package M5Paket;

import se.egy.graphics.Drawable;

import java.awt.*;

public class Rectangle implements Drawable {
    protected int width;
    protected int height;
    protected int xPos, yPos;
    protected Color color;

    /**
     * Konstruktor
     */
    public Rectangle(int w, int h, int x, int y, Color c) {
        width = w;
        height = h;
        xPos = x;
        yPos = y;
        color = c;
    }

    public int getArea() {
        int area = width * height;
        return area;
    }

    public int getOmk() {
        int omk = 2 * width + 2 * height;
        return omk;

    }

    public Color getColor() {

        return this.color;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {

        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {

        this.yPos = yPos;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(xPos, yPos, width, height);
    }


}