package BomUnited;
import boomoline.Images.Boom;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import javax.swing.*;

public class Box extends JPanel {
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private final int SPEED = 1;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }



    public Box(){
        ImageIcon ii = new ImageIcon("\"C:/Users/DELL/Desktop/Bomberman_hoamy/src/Images/bomber_down.png");
        image = ii.getImage();
        x=50;
        y=50;
    }
    public void move(){
        x+=dx;
        y+=dy;
    }


    public void keyPressed(KeyEvent e){
        int key = e .getKeyCode();
        switch(key){
            case KeyEvent.VK_UP:
                ImageIcon ii = new ImageIcon("C:/Users/DELL/Desktop/Bomberman_hoamy/src/Images/bomber_up.png");
                image = ii.getImage();
                dy = -SPEED;
                break;
            case KeyEvent.VK_DOWN:
                ImageIcon ii1 = new ImageIcon("C:/Users/DELL/Desktop/Bomberman_hoamy/src/Images/bomber_down.png");
                image = ii1.getImage();
                dy = SPEED;
                break;
            case KeyEvent.VK_LEFT:
                ImageIcon ii2=  new ImageIcon("C:/Users/DELL/Desktop/Bomberman_hoamy/src/Images/bomber_left.png");
                image = ii2.getImage();
                dx = -SPEED;
                break;
            case KeyEvent.VK_RIGHT:
                ImageIcon ii3 = new ImageIcon("C:/Users/DELL/Desktop/Bomberman_hoamy/src/Images/bomber_right.png");
                image = ii3.getImage();
                dx = SPEED;
                break;


        }
        repaint();
    }
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                dy = 0;
                break;
            case KeyEvent.VK_DOWN:
                dy = 0;
                break;
            case KeyEvent.VK_LEFT:
                dx = 0;
                break;
            case KeyEvent.VK_RIGHT:
                dx = 0;
                break;
            case KeyEvent.VK_SPACE:
                Boom bom  = new Boom(this.x,this.y);
                Main.Listboms.add(bom);
                break;
        }
        repaint();
    }
    public  void keyTyped(KeyEvent e){
//        int key = e .getKeyCode();
//        if(key==KeyEvent.VK_DOWN){
//            Boom bom  = new Boom(x,y);
//            MainGame.Listboms.add(bom);
//
//
//        }

    }


}


