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
public class C extends Thread{
    @Override
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("THREAD C:K= "+k);
            if(k==1){
                try{
                    sleep(1000);                
                }
                catch(Exception e)
                {
                    
                }
            }                                
        }
        System.out.println("EXIT FROM C");
    }
}
