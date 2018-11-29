package BomUnited;
import boomoline.Images.Boom;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Controller extends KeyAdapter implements KeyListener{
    private Box box;
    private Boom bom;
    public  Controller(Box box) {
        this.box = box;
    }
    public Controller(Boom Bom){
        this.bom = bom;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        box.keyPressed(e);
    }
    @Override
    public void keyReleased(KeyEvent e) {
        box.keyReleased(e);
    }
    public void keyTyped(KeyEvent e){
        box.keyTyped(e);
    }

}
