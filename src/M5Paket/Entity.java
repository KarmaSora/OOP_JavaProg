package M5Paket;
import se.egy.graphics.Drawable;

import java.awt.*;

public abstract class Entity implements Drawable {

    private double x,y;
    private Image img;
    private int speed, dx = 0, dy = 0;
   private boolean active = true;

    public Entity(Image img, double x, double y, int speed) {
        // Egen kod
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.img = img;
    }

    public Image getImg(){
        return img;
    }
    public void setImg(){
        this.img = img;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setDirectionX(int dx) {
        this.dx = dx;
    }
    public int getDirectionX() {
        return dx;
    }
    public void setDirectionY(int dy) {
        this.dy = dy;
    }
    public int getDirectionY() {
        return dy;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public boolean getActive(){
        return active;
    }

    public void draw(Graphics2D g) {
        g.drawImage(img, (int)x, (int)y, null);
    }

    public abstract void move();
}
