package M5Paket;

import javax.swing.*;
import java.awt.*;

public class shipEntity extends Entity{
    private Image player = new ImageIcon(getClass().getResource("/playerImg.png")).getImage();

    public shipEntity (Image image, double x, double y, int speed){
        super(image, x, y, speed);
    }


    public void move() {
       setX(getX() + getDirectionX()*getSpeed());
       setY(getY() + getDirectionY()*getSpeed());
    }


}
