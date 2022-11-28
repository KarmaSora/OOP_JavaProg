package M5Paket;

import javax.swing.*;
import java.awt.*;

public class shipEntity extends Entity{
    private Image player;

    public shipEntity (Image image, double x, double y, int speed){
        super(image, x, y, speed);
    }
    Image img = new ImageIcon(getClass().getResource("/playerImg.png")).getImage();

    player = new Entity(img, 384, 284, 3) {
        super();

    };

    public void move() {
       setX(getX() + getDirectionX()*getSpeed());
    }


}
