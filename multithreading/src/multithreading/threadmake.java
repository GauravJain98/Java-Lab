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
public class threadmake extends Thread {
    threadmake(){
        super("Using thread class");
        try{
            System.out.println("Child thread "+this);
            Thread.sleep(2000);
            start();
        }
        catch(InterruptedException e){
            System.out.println("IE caught");
        }
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("child thread"+i);
                Thread.sleep(250);
            }
        }
        catch(InterruptedException e){
            System.out.println("IE caught");
        }
    }
}
