package M5Paket;

import java.awt.*;

public class shipEntity extends Entity{
    public shipEntity(Image img, int x, int y, int speed) {
        super(img, x, y, speed);
    }


    public void move() {
       setX(getX() + getDirectionX()*getSpeed());
    }


}
