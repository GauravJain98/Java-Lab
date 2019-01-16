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
public class moose extends Applet implements MouseListener{
    public void init(){
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        showStatus("Mouse clicked at "+e.getX()+" "+e.getY());
    }
    public void mouseEntered(MouseEvent e){
        showStatus("Mouse entered at "+e.getX()+" "+e.getY());
    }
    public void mouseExited(MouseEvent e){
        showStatus("Mouse Exited at "+e.getX()+" "+e.getY());
    }
    public void mousePressed(MouseEvent e){
        showStatus("Mouse Pressed at "+e.getX()+" "+e.getY());
    }
    public void mouseReleased(MouseEvent e){
        showStatus("Mouse released at "+e.getX()+" "+e.getY());
    }
}
