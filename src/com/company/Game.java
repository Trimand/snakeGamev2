package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Game {
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean running;
    private static int UPDATE_RATE = 30;


    public void run() {
        JFrame frame = new JFrame("Snake");
        frame.setContentPane(new GamePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();

        frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        running = true;
        //drawLevelBackground();
        addKeyListener(new TAdapter());

    }

   /* public void drawLevelBackground(){
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File("C:\\Users\\Michael\\Desktop\\Kappa2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics g = frame.getGraphics();
        g.drawImage(img, -300,0,null);
    }*/

    private class TAdapter extends KeyAdapter {
    }






}


