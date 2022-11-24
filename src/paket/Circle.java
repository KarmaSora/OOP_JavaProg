package paket;

import se.egy.graphics.Drawable;

import java.awt.*;

public class Circle implements Drawable {


private int xPos, yPos, width, height;
    private Color color;


    public  Circle(int w, int h, int x, int y, Color c) {
        width = w;
        height = h;
        xPos = x;
        yPos = y;
        color = c;

    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(xPos, yPos, width, height);


    }

}


