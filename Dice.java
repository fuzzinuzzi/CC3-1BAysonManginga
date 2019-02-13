/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgx;

import java.util.Random;

public class Dice {
    
    private Random r;
  
    
    public Dice() {
        r= new Random();      
    }
    
    public int roll() {
       int x = r.nextInt(5)+1;
       return x;
    }

    

}


