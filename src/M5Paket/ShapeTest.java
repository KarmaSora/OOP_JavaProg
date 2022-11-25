package M5Paket;

import se.egy.graphics.GameScreen;

import java.awt.*;
import java.util.concurrent.RecursiveAction;

public class ShapeTest extends Shape{
    /**
     * Konstruktor, kan inte användas för att skapa ett Shapeobjekt.
     * Kan däremot anropas med super från klasser som ärver.
     *
     * @param xPos
     * @param yPos
     * @param color
     */
    public ShapeTest(int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
    }

    public static void main(String[] args) {
        GameScreen gs = new GameScreen("Rektanglar", 800, 600, false);
        Square square = new Square(100, 50, 70, Color.green);
        int area = square.getArea();
        System.out.println("AREAN = " + area);
        gs.render(square);

        Shape[] shapeArrays = new Shape[5];

       shapeArrays[0] =  new Rectangle(320, 221, 415, 125, Color.red);
       shapeArrays[1]= square;
       shapeArrays[2] = new Circle(200,200,300,Color.blue);
       shapeArrays[3]= new Square(100,600,300,Color.yellow);
        gs.render(shapeArrays);

     /**   Rectangle rectangle = new Rectangle(320, 221, 415, 125, Color.red);
        gs.render(rectangle);
        Circle Circ = new Circle(400, 230,320,140, Color.blue);
        gs.render(Circ);*/

    }


    @Override
    public void draw(Graphics2D g) {

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
