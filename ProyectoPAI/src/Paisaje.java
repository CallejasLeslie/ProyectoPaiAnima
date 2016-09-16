
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leslie Callejas
 */
public class Paisaje extends Applet {

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1, 470, 1500, 500);// fondo
        g.setColor(Color.BLACK);
        g.fillRect(1, 600, 1300, 500);// fondo abajo
        g.setColor(Color.WHITE);
        Font font= new Font("Bernard MT Condensed", Font.PLAIN,20);
        g.setFont(font);
        g.drawString("WELCOME", 650, 54);
         //Iglesia 
        g.setColor(Color.WHITE);
        g.fillRect(310, 320, 200, 100);
        g.fillRect(260, 220, 80, 200);
        g.fillRect(460, 220, 80, 200);
        g.fillOval(260, 185, 80, 80);
        g.fillOval(460, 185, 80, 80);
        g.fillOval(348, 280, 105, 105);
        //cruz
        g.drawLine(297, 145, 297, 190);
        g.drawLine(285, 165, 308, 165);
        g.drawLine(500, 145, 500, 190);
        g.drawLine(488, 165, 511, 165);
        //puertas
        g.setColor(new Color(98, 60, 0));
        g.fillRoundRect(270, 320, 50, 95, 6, 6);
        g.fillRoundRect(480, 320, 50, 95, 6, 6);
        g.fillRoundRect(354, 331, 50, 85, 6, 6);
        g.fillRoundRect(397, 331, 50, 85, 6, 6);
        g.fillOval(353, 300, 95, 95);
        g.setColor(Color.WHITE);
        g.drawRoundRect(275, 324, 40, 88, 3, 6);
        g.drawRoundRect(485, 324, 40, 88, 3, 6);
        g.drawRoundRect(365, 324, 70, 88, 3, 6);
        //camino
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(353, 417, 95, 56, 6, 6);
        //flores
        g.setColor(Color.YELLOW);
        g.fillOval(250, 425, 8, 8);
        g.setColor(Color.MAGENTA);
        g.fillOval(243, 425, 8, 8);
        g.fillOval(257, 425, 8, 8);
        g.fillOval(250, 418, 8, 8);
        g.fillOval(250, 432, 8, 8);
        g.setColor(Color.YELLOW);
        g.fillOval(273, 425, 8, 8);
        g.setColor(Color.RED);
        g.fillOval(266, 425, 8, 8);
        g.fillOval(280, 425, 8, 8);
        g.fillOval(273, 418, 8, 8);
        g.fillOval(273, 432, 8, 8);
        g.setColor(Color.YELLOW);
        g.fillOval(296, 425, 8, 8);
        g.setColor(Color.CYAN);
        g.fillOval(289, 425, 8, 8);
        g.fillOval(303, 425, 8, 8);
        g.fillOval(296, 418, 8, 8);
        g.fillOval(296, 432, 8, 8);
        g.setColor(Color.YELLOW);//
        g.fillOval(319, 425, 8, 8);
        g.setColor(Color.MAGENTA);
        g.fillOval(312, 425, 8, 8);
        g.fillOval(326, 425, 8, 8);
        g.fillOval(319, 418, 8, 8);
        g.fillOval(319, 432, 8, 8);
        g.setColor(Color.YELLOW);//
        g.fillOval(342, 425, 8, 8);
        g.setColor(Color.RED);
        g.fillOval(335, 425, 8, 8);
        g.fillOval(349, 425, 8, 8);
        g.fillOval(342, 418, 8, 8);
        g.fillOval(342, 432, 8, 8);
        //Pasto
        g.setColor(Color.GREEN);
        g.fillOval(240, 458, 10, 10);
        g.fillOval(251, 458, 10, 10);
        g.fillOval(262, 458, 10, 10);
        g.fillOval(273, 458, 10, 10);
        g.fillOval(284, 458, 10, 10);
        g.fillOval(295, 458, 10, 10);
        g.fillOval(306, 458, 10, 10);
        g.fillOval(317, 458, 10, 10);
        g.fillOval(328, 458, 10, 10);
        g.fillOval(339, 458, 10, 10);
        g.fillRoundRect(342, 440, 7, 18, 6, 6);//tallos
        g.fillRoundRect(320, 440, 7, 18, 6, 6);
        g.fillRoundRect(297, 440, 7, 18, 6, 6);
        g.fillRoundRect(274, 440, 7, 18, 6, 6);
        g.fillRoundRect(251, 440, 7, 18, 6, 6);
        g.fillOval(446, 441, 30, 30);//arbustos
        g.fillOval(466, 441, 30, 30);
        g.fillOval(486, 441, 30, 30);
        g.fillOval(506, 441, 30, 30);
        g.fillOval(526, 441, 30, 30);
        g.fillOval(546, 441, 30, 30);
        g.fillOval(566, 441, 30, 30);
        g.fillOval(586, 441, 30, 30);
        g.fillOval(586, 421, 30, 30);
        g.fillOval(586, 401, 30, 30);
        g.fillOval(586, 381, 30, 30);
        g.fillOval(586, 361, 30, 30);
        g.fillOval(586, 341, 30, 30);
        g.fillOval(566, 341, 30, 30);
        g.fillOval(546, 341, 30, 30);
        g.fillOval(540, 341, 30, 30);
        g.fillOval(230, 341, 30, 30);
        g.fillOval(210, 441, 30, 30);
        g.fillOval(210, 421, 30, 30);
        g.fillOval(210, 401, 30, 30);
        g.fillOval(210, 381, 30, 30);
        g.fillOval(210, 361, 30, 30);
        g.fillOval(210, 341, 30, 30);
        g.setColor(Color.YELLOW);//
        g.fillOval(486, 430, 8, 8);
        g.setColor(Color.RED);
        g.fillOval(479, 430, 8, 8);
        g.fillOval(493, 430, 8, 8);
        g.fillOval(486, 423, 8, 8);
        g.fillOval(486, 437, 8, 8);
        g.setColor(Color.YELLOW);//
        g.fillOval(515, 430, 8, 8);
        g.setColor(Color.CYAN);
        g.fillOval(508, 430, 8, 8);
        g.fillOval(522, 430, 8, 8);
        g.fillOval(515, 423, 8, 8);
        g.fillOval(515, 437, 8, 8);

        //edificio1
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(610, 175, 200, 150);
        g.setColor(Color.yellow);
        g.fillRect(690, 185, 30, 50);
        g.fillRect(754, 185, 30, 50);
        g.fillRect(625, 185, 30, 50);
        g.setColor(Color.BLACK);
        g.fillRect(690, 267, 30, 50);
        g.fillRect(754, 267, 30, 50);
        g.fillRect(625, 267, 30, 50);
        //Edificio2
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(610, 315, 200, 150);
        g.setColor(Color.YELLOW);
        g.fillRect(625, 335, 30, 30);
        g.fillRect(680, 335, 30, 30);
        g.fillRect(700, 335, 30, 30);
        g.fillRect(625, 385, 30, 50);
        g.setColor(Color.yellow);
        g.fillRect(680, 385, 30, 50);
        g.fillRect(700, 385, 30, 50);
        g.fillRect(754, 335, 30, 30);
        g.fillRect(754, 385, 30, 50);
        //Edificio3
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(850, 315, 120, 150);
        g.fillRect(850, 220, 120, 150);
        g.setColor(Color.YELLOW);
        g.fillRect(870, 320, 30, 30);
        g.fillRect(870, 268, 30, 30);
        g.fillRect(870, 220, 30, 30);
        g.fillRect(925, 320, 30, 30);
        g.fillRect(925, 268, 30, 30);
        g.fillRect(925, 220, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect(857, 380, 110, 80);
        //Edificio4
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(970, 315, 180, 150);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1100, 315, 120, 150);
        g.fillRect(1100, 220, 120, 150);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1180, 315, 120, 150);
        g.fillRect(1180, 220, 120, 150);
        g.setColor(Color.BLACK);
        g.fillRect(950, 380, 110, 80);
        g.setColor(Color.yellow);
        g.fillRect(980, 320, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect(1030, 320, 30, 30);
        g.fillRect(1080, 320, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect(1080, 405, 30, 30);
        g.fillRect(1130, 405, 30, 30);
        g.fillRect(1130, 320, 30, 30);
        g.setColor(Color.yellow);
        g.fillRect(1180, 405, 30, 30);
        g.fillRect(1180, 320, 30, 30);
        g.fillRect(1230, 405, 30, 30);
        g.fillRect(1230, 320, 30, 30);
        g.fillRect(1230, 250, 30, 30);
        g.fillRect(1130, 250, 30, 30);
        g.fillRect(1180, 250, 30, 30);
        //Edificios de enfrente
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(5, 620, 180, 150);
        g.fillRect(100, 620, 180, 150);
        g.fillRect(500, 620, 180, 150);
        g.fillRect(700, 620, 180, 150);
        g.fillRect(800, 620, 180, 150);
        g.setColor(Color.yellow); //ventanas edificio1
        g.fillRect(50, 630, 30, 30);
        g.fillRect(90, 630, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect(130, 630, 30, 30);
        g.fillRect(170, 630, 30, 30);
        g.fillRect(210, 630, 30, 30);
        g.setColor(Color.yellow);
        g.fillRect(510, 630, 30, 30);//ventanas edificio2
        g.fillRect(550, 630, 30, 30);
        g.fillRect(590, 630, 30, 30);
        g.fillRect(630, 630, 30, 30);
        g.fillRect(720, 630, 30, 30);//ventanas edificio3
        g.fillRect(750, 630, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect(800, 630, 30, 30);
        g.fillRect(840, 630, 30, 30);
        g.fillRect(880, 630, 30, 30);
        g.fillRect(920, 630, 30, 30);
        //luna
        g.setColor(Color.WHITE);
        g.fillOval(1100, 10, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(1050, 10, 100, 100);
        // arboles
        g.setColor(new Color(100, 50, 0));
        g.fillRect(30, 290, 30, 70); //tronco1
        g.fillRect(135, 380, 30, 90);//tronco2
        g.setColor(new Color(0, 200, 0));
        g.fillOval(1, 200, 100, 100);//circulo cental A1
        g.fillOval(110, 280, 80, 80);//A2
        g.fillOval(90, 310, 100, 80);//A2
        g.fillOval(110, 310, 100, 80);//A2
        g.fillOval(-10, 210, 80, 80);//A1 IZQUIERDO
        g.fillOval(15, 210, 100, 80);//A1 DERECHO
        g.fillOval(10, 180, 80, 100);//A1 ARRIBA
        //arbol edificios de enfrente 1
        g.fillOval(400, 630, 80, 80);
        g.fillOval(320, 630, 100, 80);
        g.fillOval(360, 620, 80, 100);
        //arbol edificios de enfrente 2
        g.fillOval(990, 630, 100, 80);
        g.fillOval(1020, 620, 80, 100);
        //linea carretera
        g.setColor(Color.white);
        g.drawLine(-1, 535, 1400, 535);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1121, 600, 180, 150);// calle derecha
        //semaforo
        g.setColor(Color.WHITE);
        g.fillRoundRect(1104, 594, 10, 50, 6, 6);
        g.setColor(Color.BLACK);
        g.fillRoundRect(1094, 560, 30, 47, 6, 6);
        g.setColor(Color.RED);
        g.fillOval(1105, 565, 9, 9);
        g.setColor(Color.YELLOW);
        g.fillOval(1105, 580, 9, 9);
        g.setColor(Color.GREEN);
        g.fillOval(1105, 595, 9, 9);
        g.setColor(Color.WHITE);
        g.drawOval(1104, 564, 10, 10);
        //lampara
        g.setColor(Color.WHITE);
        g.fillRoundRect(825, 366, 10, 100, 6, 6);
        g.setColor(Color.ORANGE);
        g.fillOval(818, 363, 25, 25);

        g.setColor(Color.WHITE);
        g.drawLine(90, 5, 110, 90);//estrella fugaz
        g.drawRoundRect(970, 220, 50, 95, 3, 6);//ventana de vidrio
        g.drawRoundRect(1000, 220, 50, 95, 3, 6);
        g.drawRoundRect(1030, 220, 50, 95, 3, 6);
        g.drawRoundRect(1050, 220, 50, 95, 3, 6);
        g.drawOval(150, 70, 1, 2);//estrellas
        g.fillOval(920, 100, 13, 10);
        g.drawOval(250, 20, 1, 2);
        g.drawOval(350, 70, 1, 2);
        g.drawOval(450, 40, 1, 2);
        g.drawOval(550, 90, 1, 2);
        g.drawOval(50, 170, 1, 2);
        g.drawOval(80, 160, 1, 2);
        g.drawOval(50, 70, 1, 2);
        g.drawOval(10, 20, 1, 2);
        g.drawOval(70, 40, 1, 2);
        g.drawOval(530, 70, 1, 2);
        g.drawOval(750, 40, 1, 2);
        g.drawOval(980, 40, 1, 2);
        g.drawOval(1050, 20, 1, 2);
        g.drawOval(1350, 70, 3, 5);
        g.drawOval(1250, 70, 1, 2);
        g.drawOval(1550, 90, 1, 2);
        g.drawOval(1350, 50, 1, 2);
        g.drawOval(1180, 160, 1, 2);
        g.drawOval(950, 10, 1, 2);
        g.drawOval(610, 4, 1, 2);
        g.drawOval(870, 40, 1, 2);
        g.drawOval(1130, 7, 1, 2);
        g.drawOval(910, 40, 1, 2);
        g.drawOval(880, 30, 1, 2);
        g.drawOval(530, 100, 1, 2);
        g.drawOval(640, 170, 1, 2);
        g.drawOval(250, 140, 1, 2);
        g.drawOval(460, 90, 1, 2);
        g.drawOval(550, 170, 1, 2);
        g.drawOval(780, 160, 1, 2);
        g.drawOval(850, 170, 1, 2);
        g.drawOval(510, 120, 1, 2);
        g.drawOval(370, 140, 1, 2);
        g.drawOval(330, 70, 1, 2);
        g.drawOval(950, 240, 1, 2);
        g.drawOval(780, 230, 1, 2);
        g.drawOval(250, 200, 1, 2);
        g.drawOval(350, 170, 1, 2);
        g.drawOval(450, 240, 1, 2);
        g.drawOval(550, 190, 1, 2);
        g.drawOval(50, 170, 1, 2);
        g.drawOval(80, 160, 1, 2);
        g.drawOval(50, 170, 1, 2);
        g.drawOval(10, 120, 1, 2);
        g.drawOval(70, 140, 1, 2);
        g.drawOval(130, 90, 1, 2);
        g.drawOval(150, 40, 1, 2);
        g.drawOval(180, 30, 1, 2);
        g.drawOval(1100, 130, 1, 2);
        g.drawOval(1100, 230, 1, 2);
        g.drawOval(1000, 130, 1, 2);
        g.drawOval(1000, 30, 1, 2);
        //auto
        g.setColor(Color.BLUE);
        g.fillRoundRect(25, 455, 95, 50, 6, 6);
        g.setColor(Color.BLACK);
        g.fillOval(35, 504, 25, 25);
        g.fillOval(85, 504, 25, 25);
        g.fillRect(85, 465, 20, 20);
        g.fillRect(45, 465, 20, 20);
        g.setColor(Color.red);
        g.fillRoundRect(550, 455, 95, 50, 6, 6);
        g.setColor(Color.BLACK);
        g.fillOval(560, 504, 25, 25);
        g.fillOval(610, 504, 25, 25);
        g.fillRect(610, 465, 20, 20);
        g.fillRect(565, 465, 20, 20);
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(1235, 595, 50, 95, 6, 6);
        g.setColor(Color.BLACK);
        g.fillRect(1242, 609, 20, 20);
        g.fillRect(1260, 609, 20, 20);
        g.setColor(Color.GREEN);//auto abajo 1
        g.fillRoundRect(830, 520, 95, 50, 6, 6);
        g.setColor(Color.BLACK);
        g.fillOval(890, 555, 25, 25);
        g.fillOval(840, 555, 25, 25);
        g.fillRect(887, 525, 20, 20);
        g.fillRect(848, 525, 20, 20);
        g.setColor(Color.PINK);//2
        g.fillRoundRect(230, 520, 95, 50, 6, 6);
        g.setColor(Color.BLACK);
        g.fillOval(290, 555, 25, 25);
        g.fillOval(240, 555, 25, 25);
        g.fillRect(287, 525, 20, 20);
        g.fillRect(248, 525, 20, 20);

        //niño
        g.setColor(Color.WHITE);
        g.drawOval(975, 395, 10, 10);//cabeza
        g.drawLine(980, 405, 980, 435);//tronco
        g.drawLine(975, 415, 985, 415);//brazos
        g.drawLine(980, 435, 985, 445);
        g.drawLine(980, 435, 975, 445);
        //niña
        g.drawOval(910, 395, 10, 10);//cabeza
        g.drawLine(915, 405, 915, 425);
        g.drawLine(910, 415, 920, 415);//brazos
        g.setColor(Color.MAGENTA);
        g.drawLine(915, 425, 920, 435);
        g.drawLine(915, 425, 910, 435);
        g.drawLine(910, 435, 920, 435);
        g.setColor(Color.WHITE);
        g.drawLine(913, 435, 913, 445);
        g.drawLine(917, 435, 917, 445);
        

    }

}
