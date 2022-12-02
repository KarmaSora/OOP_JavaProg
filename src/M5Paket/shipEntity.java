package M5Paket;

import javax.swing.*;
import java.awt.*;

public class shipEntity extends Entity{
    public shipEntity (Image image, double x, double y, int speed){
        super(image, x, y, speed);
    }
   private Image player = new ImageIcon(getClass().getResource("/playerImg.png")).getImage();


    public void move() {
       setX(getX() + getDirectionX()*getSpeed());
    }


}
