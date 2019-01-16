/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment4;

/**
 *
 * @author ks834
 */
import java.util.*;
public class Experiment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        figure b=new triangle();
        double ar=b.area();
        System.out.println("The area of the triangle is "+ar);
        b=new rectangle();
        ar=b.area();
        System.out.println("The area of the rectangle is "+ar);
    }
    
}

