package abhishek;

import  javax.swing.*;


public class Game {

    public static int HEIGHT = 450;
    public static int WIDTH = 800;

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        GamePanel panel =new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
