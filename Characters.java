package rpg;

public class Characters {
    //static variables
    static Dice_test dice = new Dice_test();
    private final String name;
    private final int strength;
    private final int dexterity;
    private final int intelligence;
    
    
    
    //instance variables
    private int maxLife;
    private int currentLife;
    private int damage;
    
      
    
            
    /* Constructor takes 4 parameters: n, s, d, i and assigns them to 
    instance variables name, strength, dexterity, intelligence.
    Also uses the dice instance to assign a random
    number to maxlife. currentLife is initialized to maxlife
    */
    public Characters (String n, int s, int d, int i){
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        
        maxLife = dice.roll() *4;
        currentLife = maxLife;
        
    }
    
    /* returns a random die roll using the roll method
    in the Dice.java, modified by the character's strength
    */
    public int attack(){
        int attack = (dice.roll()*this.strength) + this.intelligence + this.dexterity;
        this.damage = attack;
        return attack;
    }
    
    
    //decreases currentlife by the damage parameter
    public void wound (int damage){
        damage = dice.roll (); 
        this.currentLife -= damage;
    }
    
    /* Increases currentlife by the heal parameter.
    currentlife cannot be greater than maxlife
    */
    public void heal(int heal){
        int healed = this.currentLife + heal;
        
    }
    
    /* returns name
    */
    public String getName(){
        return name;
    }
    
    /* returns strength
    */
    public int getStrength(){
        return strength;
    }
    
    /* returns dexterity
    */
    public int getDexterity(){
        return dexterity;
    }
    
    //returns intelligence
    public int getIntelligence(){
        return intelligence;
    }
    
    //returns currentlife
    public int getCurrentLife(){
        return currentLife;
    }
    
    //returns maxlife
    public int getMaxLife(){
        return maxLife;
    }
}