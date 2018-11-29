package BomUnited;

import boomoline.Images.Boom;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Main extends JPanel implements ActionListener{
    private Timer timer;
    private final int DELAY = 10;
    private Box box;
    public static ArrayList<Boom> Listboms = new ArrayList<>();

    public Main() {
        setFocusable(true);
        setBackground(Color.WHITE);
        box = new Box();
        Controller adapter = new Controller(box);
        addKeyListener(adapter);
        timer = new Timer(DELAY, this);
        timer.start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(box.getImage(), box.getX(), box.getY(), this);
        for(Boom bom : Listboms){
            getGraphics().drawImage(bom.getImage(), bom.getX(), bom.getY(), this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        box.move();


        repaint();
    }


}