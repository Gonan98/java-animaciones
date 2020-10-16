package com.animation;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    
    private static final long serialVersionUID = 1L;

    public MyFrame() {
        
        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(new MyPanel());
    }

}
