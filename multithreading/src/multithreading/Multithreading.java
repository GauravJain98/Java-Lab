/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author ks834
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        threadmake t1=new threadmake();
        try{
            for(int j=5;j>0;j--){
                System.out.println("Running main "+j);
                Thread.sleep(750);
            }
        }
        catch(InterruptedException e){
            System.out.println("IE caught");
        }
        System.out.println("Exiting main");
    }
}
