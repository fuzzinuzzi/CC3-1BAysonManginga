package rpg;

public class Character {
    
    public Character(){
        Dice_test d = new Dice_test();    
        Characters Troy = new Characters("Gryffindor Student Wizard Troy", d.roll(), d.roll(), d.roll());
        Characters Kc = new Characters("Hufflepuff Student Wizard Kc", d.roll(), d.roll(), d.roll());
        
        for(int i = 1; i <= 3; i++){   
            System.out.println("ROUND " + i + "!");
            
            
            System.out.println(Troy.getName() + ": " + Troy.getCurrentLife());
            System.out.println(Kc.getName() + ": " + Kc.getCurrentLife());
            
            int tAttack = Troy.attack(), kAttack = Kc.attack();
            
           System.out.println(Troy.getName() + " attacks " + Kc.getName() + " for " + tAttack + " damage!");
           System.out.println(Kc.getName() + " attacks " + Troy.getName() + " for " + kAttack + " damage!");
            
            Kc.wound(tAttack);
            Troy.wound(kAttack);
         
           System.out.println(" ");
            if((Troy.getCurrentLife() <= 0) && (Kc.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " +Troy.getName() + " is: " + Troy.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + Kc.getName() + " is: " + Kc.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println(Kc.getName() + " wins!" );
                break;
            }
            else if ((Kc.getCurrentLife() <= 0) && (Troy.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + Troy.getName() + " is: " + Troy.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + Kc.getName() + " is: " +Kc.getCurrentLife() + "!");
            System.out.println(" ");
                System.out.println(Troy.getName() + " wins!");
                break;
            }
            else if((Troy.getCurrentLife()<=0) && (Kc.getCurrentLife()<=0) ){
                System.out.print("\nFinal HP of " + Troy.getName() + " is: " + Troy.getCurrentLife() + "!");
                System.out.print("\nFinal HP of " +Kc.getName() + " is: " + Kc.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println("Draw!");
                break;
            }
        }
   }

    int getIntelligence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

}