/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp_7;
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**
 *
 * @author ks834
 */
public class event_h extends Applet implements ActionListener {
    Button b1=new Button("OK");
    public void init(){
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        showStatus("Button OK");
    }
}
