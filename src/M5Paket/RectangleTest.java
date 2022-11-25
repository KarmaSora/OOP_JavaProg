package M5Paket;


import se.egy.graphics.GameScreen;

import java.awt.*;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        paket.Rectangle rect = new paket.Rectangle(100,300,50,70, Color.green);

        int area = rect.getArea();

        System.out.println("Arean är = " +  area);
        System.out.println("Omkretsen är = " +  rect.getOmk());
        System.out.println("color = " + Color.green);
        */

        GameScreen gs = new GameScreen("Rektanglar", 800, 600, false);

        Rectangle rect = new Rectangle(100, 300, 50, 70, Color.red);


        gs.render(rect);
        /*
        * System.out.println("change Xand Y positions, start with X and then click enter  before inserting Y");
        System.out.println("current X and Y positoons: X = " + rect.getxPos() + " Y pos = " + rect.getYPos());
        rect.setxPos(input.nextInt());
        rect.setYPos(input.nextInt());
        System.out.println("Update: X = " + rect.getxPos() + " Y pos = " + rect.getYPos());
        *
        * */

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        ; // pausar i 2000 ms = 2 s

        gs.render(rect);


    }
}
