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
public class triangle extends figure {
    @Override double area(){
        System.out.println("Enter the base");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.println("Enter the height");
        float b=sc.nextFloat();
        double ar=0.5*a*b;
        return ar;
    }
}
