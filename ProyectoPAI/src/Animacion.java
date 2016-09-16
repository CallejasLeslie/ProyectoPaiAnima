/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leslie Callejas
 */
import java.awt.*;
import java.applet.*;

public class Animacion extends Applet implements Runnable {

    Thread hilo;  //creación del hilo 
    int radio = 50;     //radio de la pelota
    int x = 1400/4, y= 700/10;       //posición del centro de la pelota
    int dx = 1;     //desplazamiento en x
    int retardo = 50;

    public void start() {
        if (hilo == null) {
            hilo = new Thread(this);
            hilo.start();
        }
    }

    public void stop() {
        if (hilo != null) {
            hilo = null;
        }
    }

    public void run() {
        while (true) {
            mover();
            try {
                Thread.sleep(retardo);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    void mover() {
        x += dx;
        if (x >= (1400 - radio) || x < radio) {
            dx *= -1;
        }
        repaint();   //llama a paint
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }
}
