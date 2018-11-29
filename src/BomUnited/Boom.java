package BomUnited;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;


public class Boom {

    private int x;
    private int y;
    private Image image;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }


    public Boom() {

    }

    public Boom(int x, int y){
        ImageIcon ii = new ImageIcon("C:/Users/DELL/Desktop/Bomberman_hoamy/src/Images/bomb.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;
    }



}

