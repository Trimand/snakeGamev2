package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Game {

    private boolean running;
    private static int UPDATE_RATE = 30;
    public JFrame frame;

    public void run() {

        frame = new JFrame("SNAKE");
        frame.setContentPane(new GamePanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        running = true;
        drawLevelBackground();



        loopLogic();

    }

    public void drawLevelBackground(){
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File("C:\\Users\\Michael\\Desktop\\lol.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics g = frame.getGraphics();
        g.drawImage(img, 0,0,null);
    }
    public void loopLogic() {
        //GAME LOGIC
        //Update dit screen/image/frame, whatever
        try {
            Thread.sleep(1000 / UPDATE_RATE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (running) {
            loopLogic();
        }
    }
}

