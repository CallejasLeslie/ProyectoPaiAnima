
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Point2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leslie Callejas
 */
class Panel extends JPanel implements Runnable {

    Point2D.Double[] pts = new Point2D.Double[1200];

    private int alto, ancho;
    Paisaje Paisaje = new Paisaje();
            
            

    public Panel() {
        ancho = 1500;
        alto = 574;

        setPreferredSize(new Dimension(ancho, alto));
        setBackground(Color.BLACK);
        for (int i = 0; i < pts.length; i++) {
            pts[i] = new Point2D.Double(Math.random(), Math.random());
        }
        Thread thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < pts.length; i++) {
            int x = (int) (ancho * pts[i].x);
            int y = (int) (alto * pts[i].y);
            int h = (int) (5 * Math.random());
            g.drawLine(x, y, x, y + h);
            Paisaje.paint(g);
            
            
        }
    }

    public void run() {
        while (true) {
            for (int i = 0; i < pts.length; i++) {
                double x = pts[i].getX();
                double y = pts[i].getY();
                y += 0.9 * Math.random();
                if (y > 1) {
                    y = 0.9 * Math.random();
                    x = Math.random();
                }
                pts[i].setLocation(x, y);
            }
            repaint();
            try {
                Thread.sleep(70);
            } catch (InterruptedException ex) {
            }
        }
    }
}
