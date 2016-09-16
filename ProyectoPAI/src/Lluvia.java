
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leslie Callejas
 */
public class Lluvia extends JApplet {
    
    
    

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("LESLIE CALLEJAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Lluvia();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        Panel panel = new Panel();
        getContentPane().add(panel);

    }
    
}

