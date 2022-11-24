package M5Paket;

import java.awt.*;

public class Square extends Rectangle {
    /**
     * Konstruktor till Square
     */

    public Square(int w,int x, int y, Color c){
        super(w, w, x, y, c); // Anropar Rectangle's konstruktor        //  ska man ha detta?

        width = height = w;
        yPos = y;
        color = c;
    }

    /**
    public Square(int w, int x, int y, Color c) {
        super(w, w, x, y, c); // Anropar Rectangle's konstruktor
    }*/
}
