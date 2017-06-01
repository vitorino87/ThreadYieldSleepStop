/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadyieldsleepstop;

/**
 *
 * @author tiago.lucas
 */
public class B extends Thread{
    @Override
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("THREAD B:J= "+j);
            if(j==3)
                stop();
        }
        System.out.println("EXIT FROM B");
    }
}
