package M5Paket;

import java.awt.*;

public class Ellipse extends Shape {

    /**
     * Konstruktor, kan inte användas för att skapa ett Shapeobjekt.
     * Kan däremot anropas med super från klasser som ärver.
     *
     * @param xPos
     * @param yPos
     * @param color
     */

    private int diameterHight;
    private int diameterWidth;

    public Ellipse(int diameterHight, int diameterWidth, int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
        this.diameterHight = diameterHight;
        this.diameterWidth = diameterWidth;

    }

    public double EllipseOmkrets(int diameterHight, int diameterWidth){

        double omkrets = Math.PI*((2*diameterHight*diameterHight) +2*diameterWidth*diameterWidth);

        return omkrets;
    }


    @Override
    public void draw(Graphics2D g) {
    g.setColor(getColor());
    g.fillOval(getxPos(),getyPos(), diameterHight, diameterWidth);
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getOmk() {
        return 0;
    }
}
