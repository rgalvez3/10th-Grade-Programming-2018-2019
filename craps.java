import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner kin = new Scanner(System.in);
        System.out.println("Lets play craps");
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        int dies = die1 + die2;
        System.out.println("First roll: " + dies);
        
        
        if  (dies == 2 || dies == 3 || dies == 12)
            System.out.println("you lose");
        
        else if  (dies == 7 || dies == 11)
            System.out.println("you win");
        
        else{
            int die3 = (int)(Math.random() * 6) + 1;
            int die4 = (int)(Math.random() * 6) + 1;
            int dies2 = die1 + die2;
            System.out.println("Next Roll: " + dies2);
            
            if (dies2 == dies)
                System.out.println("you win");
            
            else if (dies2 == 7)
                System.out.println("you lose");
        }
        
        
    }
}
