/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp_7;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author ks834
 */
public class face extends Applet {
    public void paint(Graphics g){
        g.drawString("Always smilling",50,30);
        g.drawOval(60,60,200,200);
        g.fillOval(90, 120, 50, 20);
        g.fillOval(190, 120, 50, 20);
        g.drawLine(165, 125, 165, 175);
        g.drawArc(110, 130, 95, 95, 0, -180);
        g.drawLine(165, 125, 165, 175);
    }
}
