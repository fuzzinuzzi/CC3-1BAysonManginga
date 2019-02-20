package rpg;

public class Wizard extends Characters{
    Dice_test dice = new Dice_test();
    //private int castLightningBolt;
    //private int castHeal;
    private int getMaxMagic;
    
    public int maxMagic;
    public int currentMagic;
    
    
    
    public Wizard(String n, int s, int d, int i){ 
        super(n,s,d,i);
    }
    
    public int castLightningBolt(){
        if(this.currentMagic >= 15){
            return dice.roll() * super.getIntelligence();
        }
        else return 0;
    }
    
    
    public int castHeal(int castHeal){
        if(this.currentMagic >= 4){
            return dice.roll()*super.getIntelligence();
        }
        else return castHeal;
    }

    
    public int getMaxMagic(){            
        return maxMagic;
    }
    
    public void setMaxMagic(int maxMagic){
        this.maxMagic = maxMagic;
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }
    
    public void setCurrentMagic(int currentMagic){
        this.currentMagic = currentMagic;
    }
    
    
}
