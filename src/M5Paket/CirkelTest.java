package M5Paket;

import se.egy.graphics.Drawable;
import se.egy.graphics.GameScreen;

import java.awt.*;

public class CirkelTest {
    public static void main(String[] args) {

        Drawable shapeshifter[] = new Drawable[5];

        GameScreen gameScreen = new GameScreen("screen", 1000, 1000, false);
        Circle[] circleArray = new Circle[4];


        circleArray[0] = new Circle(200, 200, 200, 200, Color.red);
        circleArray[1] = new Circle(300, 300, 0, 0, Color.blue);
        circleArray[2] = new Circle(300, 300, 200, 400, Color.green);
        circleArray[3] = new Circle(300, 300, 400, 400, Color.white);


        Rectangle rect = new Rectangle(100, 456, 300, 600, Color.cyan);
        Rectangle recta = new Rectangle(400, 450, 100, 600, Color.cyan);

        shapeshifter[0] = rect;
        shapeshifter[1] = circleArray[0];
        shapeshifter[2] = circleArray[1];
        shapeshifter[3] = circleArray[2];
        shapeshifter[4] = recta;


        gameScreen.render(shapeshifter);


    }
}
