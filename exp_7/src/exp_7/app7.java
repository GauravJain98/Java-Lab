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
public class app7 extends Applet {
    public void paint(Graphics g){
        g.drawRect(100,100,200,200);
        Font f1=new Font("Arial",Font.PLAIN,18);
        Font f2=new Font("Arial",Font.PLAIN,22);
        Font f3=new Font("Arial",Font.PLAIN,24);
        g.setFont(f1);
        g.setColor(Color.red);
        g.drawString("Large", 110, 120);
        g.setFont(f2);
        g.setColor(Color.blue);
        g.drawString("Larger", 110, 150);
        g.setFont(f3);
        g.setColor(Color.yellow);
        g.drawString("Largest", 110, 180);
        
    }
}
