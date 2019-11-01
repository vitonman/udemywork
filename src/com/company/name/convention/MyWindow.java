package com.company.name.convention;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font santSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font santSerifSmall = new Font("SansSerif", Font.BOLD, 12);

        g.setFont(santSerifLarge);
        g.drawString("The my first desctop app", 60, 60);

        g.setFont(santSerifSmall);
        g.drawString("by Vita Maximys", 60, 100);



    }
}
