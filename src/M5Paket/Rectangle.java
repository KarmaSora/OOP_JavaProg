package M5Paket;

import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height, int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(xPos, yPos, width, height);
    }

    public int getArea() {
        int area = width*height;
        return area;
    }

    public int getOmk() {
        int omk = 2*(width+height);
        return omk;
    }
}
