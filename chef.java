
import java.util.Scanner;

public class chef{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your first name? ");
        String first = kin.nextLine();
        System.out.print("What is your last name? ");
        String last = kin.nextLine();
        System.out.println("Hello " + first + last + ", it's nice to meet you!");
        
        System.out.print("What is your Street Address? ");
        String Address = kin.nextLine();
        System.out.print("What is your City? ");
        String City = kin.nextLine();
        System.out.print("What is your State? ");
        String State = kin.nextLine();
        System.out.print("What is your Zip? ");
        String Zip = kin.nextLine();
        System.out.println(first + last);
        System.out.println(Address);
        System.out.println(City + ", " + State + " " + Zip);

		
	}
}

