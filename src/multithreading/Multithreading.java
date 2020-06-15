/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Abu Yasser
 */
public class Multithreading {

   
    public static void main(String[] args) {
        ReadFile r1=new ReadFile();
     // r1.setPriority(Thread.MIN_PRIORITY);		

         ReadFile r2=new ReadFile();
          Thread t1 =new Thread(r1);
          Thread t2 =new Thread(r2);

          t1.start();
          t2.start();
    }
    
}
