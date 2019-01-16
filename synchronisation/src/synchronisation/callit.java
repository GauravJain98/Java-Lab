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
public class callit {
    void call(String msg){
        System.out.println("Out: "+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("IE caught");
        }
    }
}
