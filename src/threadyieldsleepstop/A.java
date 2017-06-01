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
public class A extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            if(i==1)
                yield();
            System.out.println("THREAD A:i= "+i);
        }
        System.out.println("EXIT FROM A");
    }
}
