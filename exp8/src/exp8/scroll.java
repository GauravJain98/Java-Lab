/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp8;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ks834
 */
public class scroll extends Applet implements AdjustmentListener{
    Scrollbar s1,s2,s3;
    public void init(){
        s1=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,255);
        s2=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,255);
        s3=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,255);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        add(s1);
        add(s2);
        add(s3);
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        repaint();
    }
    public void paint(Graphics g){
        int x,y,z;
        x=s1.getValue();
        y=s2.getValue();
        z=s3.getValue();
        Color c=new Color(x,y,z);
        setBackground(c);
    }
}
