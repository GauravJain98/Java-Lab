/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronisation;

/**
 *
 * @author ks834
 */
public class Synchronisation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        callit target=new callit();
        caller obj1=new caller(target,"hello");
        caller obj2=new caller(target,"Synchronized");
        caller obj3=new caller(target,"world");
    }
    
}
