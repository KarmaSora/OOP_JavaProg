package M5Paket;

import se.egy.graphics.Drawable;

import java.awt.*;

public abstract class Shape implements Drawable {
    protected int xPos, yPos;
    protected Color color;

    /**
     * Konstruktor, kan inte användas för att skapa ett Shapeobjekt.
     * Kan däremot anropas med super från klasser som ärver.
     */
    public Shape(int xPos, int yPos, Color color){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }

    public void setxPos(int xPos){
        this.xPos=xPos;
    }
    public void setyPos(int xPos){
        this.xPos=xPos;
    }

    public int getxPos(){
        return xPos;
    }  public int getyPos(){
        return yPos;
    }
    public abstract void draw(Graphics2D g);

    public abstract int getArea();
    public abstract int getOmk();
}

