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
public class caller implements Runnable{
    String msg;
    callit target;
    Thread t;
    public caller(callit targ,String s){
        target=targ;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    @Override
        public void run(){
            synchronized(target){
                target.call(msg);
            }
    }
}

