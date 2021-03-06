package com.project610;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SpriteSwapper {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // Dunno if the stuff below does anything, just trying to fix Manjaro text size issues
            JFrame.setDefaultLookAndFeelDecorated(true);
            System.setProperty("awt.useSystemAAFontSettings","on");
            System.setProperty("swing.aatext", "true");
        } catch (Exception ex) {
            System.err.println("Look and feel broke, probably falling back on the garbo L&F");
            ex.printStackTrace();
        }
        JFrame jf = new JFrame("La-Mulana Sprite Swapper");
        //jf.setSize(100, 100);
        jf.setMinimumSize(new Dimension(710, 611));
        MainPanel mainPanel = new MainPanel(args, jf);
        mainPanel.setBackground(new Color(230, 230,230));
        jf.setContentPane(mainPanel);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //jf.setResizable(false);
        try {
            jf.setIconImage(ImageIO.read(SpriteSwapper.class.getClassLoader().getResource("icons/appIcon.png")));
        } catch (Exception ex) {
            mainPanel.error("Failed to set app icon", ex);
        }
        jf.setVisible(true);

        mainPanel.loadSprites();
    }
}
