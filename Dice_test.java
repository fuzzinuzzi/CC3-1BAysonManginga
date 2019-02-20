package rpg;
import java.util.Random;

public class Dice_test {
    //instance variables
    
    private int roll;
    private final Random r;
    //instantiate the object r
    public Dice_test(){
       this.r = new Random();
        
    }
    public int roll(){
        int roll = r.nextInt(6)+1;
 
        return roll;
    }


}
