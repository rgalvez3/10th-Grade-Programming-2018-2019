import java.util.*;
import java.lang.Math;

public class Dice{
public static void main(String[] args){
Scanner kin = new Scanner(System.in);

int l = 0 ;


do{
System.out.println("Rolling dice");
int die1 = (int)(Math.random() * 6) + 1;
int die2 = (int)(Math.random() * 6) + 1;
int dies = die + die2;

System.out.println("Die 1: " + die + " Die 2:" + die2 + " Sum of two dice: " + dies);
System.out.println ("Would you like to roll again? (y/n)");
String choice = kin.nextLine();

if (choice.equals("n")){
  System.out.println("good bye");
  l= l +1;
}
else if (choice.equals("y"))
l = 0;

} while (l == 0);
  
	}
}



