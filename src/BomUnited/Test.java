package BomUnited;

import javax.swing.*;

public class Test extends JFrame {

    public Test() {
        add(new Main());
        setSize(480,360);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Test();
    }
}