package M5Paket;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import se.egy.graphics.GameScreen;

import javax.swing.*;

// new version of Entity.java, old version deleted!
public class GameEntity  implements KeyListener{
    private HashMap <String, Boolean> keyDown = new HashMap<>();
    private shipEntity player;
    private  boolean gameRunning = true;
    private GameScreen gameScreen = new GameScreen("Game", 640, 480, false); // false vid testkörning

    public GameEntity(){

        gameScreen.setKeyListener(this);
        keyDown.put("left", false);
        keyDown.put("right", false);
        keyDown.put("up",false);
        keyDown.put("down",false);
        keyDown.put("esc",false);

        loadImages();
        gameLoop();
    }

    public void loadImages(){

        // Laddar in bild som ligger i katalogen resources
       // Image img = new ImageIcon(getClass().getResource("/playerImg.png")).getImage();
        Image img = new ImageIcon(getClass().getResource("../ship.png")).getImage();

        player = new shipEntity(img, 384, 284, 5) {


        };
        gameScreen.setBackground("/space-background.jpg");

    }
    public void update(){
        player.setDirectionX(0);
        player.setDirectionY(0);

        if(player.getX() < gameScreen.getWidth()-70){
            if (keyDown.get("right")) {
                player.setDirectionX(1);
                //player.setX(player.getX() + player.getSpeed());
            }}
        if(player.getX() > 0 ){
            if (keyDown.get("left")) {
                player.setDirectionX(-1);
            }}
        if(player.getY() < gameScreen.getHeight()-100 ){
            if (keyDown.get("down")) {
                player.setDirectionY(1);
            }}
        if(player.getY() > 0 ){
            if (keyDown.get("up")) {
                player.setDirectionY(-1);
            }}
        if(keyDown.get("esc")){
            gameRunning = false;
            try{
                System.out.println("game is closed");
                gameScreen.close();
            }catch (Exception e){

            }
        }

        player.move();
    }
    public void render(){
        gameScreen.render(player);
    }
    public void gameLoop(){
        while(gameRunning){
            update();
            render();
            // Fördröjning
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }

    }
    /** Spelets tangentbordslyssnare */
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT)
            keyDown.put("left", true);
        else if(key == KeyEvent.VK_RIGHT)
            keyDown.put("right", true);
        else if(key == KeyEvent.VK_UP)
            keyDown.put("up", true);
        else if(key == KeyEvent.VK_DOWN)
            keyDown.put("down", true);
        else if (key == KeyEvent.VK_ESCAPE)
            keyDown.put("esc", true);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT)
            keyDown.put("left", false);
        else if(key == KeyEvent.VK_RIGHT)
            keyDown.put("right", false);
        else if(key == KeyEvent.VK_UP)
            keyDown.put("up", false);
        else if(key == KeyEvent.VK_DOWN)
            keyDown.put("down", false);
    }

    public static void main(String[] args) {

        new GameEntity();
    }



}
