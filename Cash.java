import java.util.Scanner;

class Cash {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.println("Welcome to the Change Generator"); 
    System.out.println("Please Enter the amount of a Bill"); 
    System.out.print("Bill: "); 
double bill = kin.nextDouble();
    System.out.println("Please Enter the amount Paid");  
    System.out.print("Paid: "); 
    double paid = kin.nextDouble();
    double change = (paid-bill);
    System.out.println("change: $" + change); 
    
    double twenty = (change/20);
    int twentyd = ((int)twenty);//The d at the end of twenty is ment to represent dollars.This is the case for all dollar values
    int twentydisplay = Math.abs(twentyd);//There was a error in results where some coin/dollar values would be the correct amount but was negative so this will be used in display but not in calculations
     System.out.println("20: " + twentydisplay); 
    double change1 = ((twentyd*20)- change);
    
    double ten = (change1/10);
    int tend = ((int)ten);
    int tendisplay = Math.abs(tend);
     System.out.println("10: " + tendisplay); 
    double change2 = ((tend*10) - change1);
    
    double five = (change2/5);
    int fived = ((int)five);
    int fivedisplay = Math.abs(fived);
    System.out.println("5: " + fivedisplay); 
    double change3 = ((fived*5)- change2);

    double one = (change3/1);
    int oned = ((int)one);
    int onedisplay = Math.abs(oned);
     System.out.println("1: " + onedisplay); 
    double change4 = ((oned*1)-change3);
    
    
    double twentyfive = (change4/.25);
    int twentyfivec = ((int)twentyfive);
    int twentyfivedisplay = Math.abs(twentyfivec);
     System.out.println(".25: " + twentyfivedisplay); 
    double change5 = ((twentyfivec*.25)- change4);
    
    double tenn = (change5/.10);
    int tennc = ((int)tenn);
    int tenndisplay = Math.abs(tennc);
    System.out.println(".10: " + tenndisplay); 
    double change6 = ((tennc*.10) - change5);
    
    double fivve = (change6/.05);
    int fivvec = ((int)fivve);
    int fivvedisplay = Math.abs(fivvec);
    System.out.println(".05: " + fivvedisplay); 
    double change7 = ((fivvec*.05) - change6);
    
    double onne = (change7/.01);
    int onnec = ((int)onne);
    int onnedisplay = Math.abs(onnec);
    System.out.println(".01: " + onnedisplay);
  }
}