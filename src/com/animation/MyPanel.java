package com.animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener {

    
    private static final long serialVersionUID = 1L;
    private int x;
    private int y;
    private int vx;
    private int vy;
    private Timer timer;

    public MyPanel() {
        x = y = 0;
        vx = vy = 10;
        this.setBackground(new Color(53,81,92));
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2D = (Graphics2D) g;
        //g2D.setColor(Color.YELLOW);
        //g2D.fillOval(x, y, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += vx;
        y += vy;

        if (x + vx < 0 || x + 100 > this.getBounds().width) {
            vx *= -1;
        }

        if (y + vy < 0 || y + 100 > this.getBounds().height) {
            vy *= -1;
        }


        this.repaint();

    }
    
}
