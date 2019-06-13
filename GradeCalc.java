//Group 5 is Yumna, Ximena, Cristian, and Rolando 
import java.util.Scanner;
class GradeCalc {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    System.out.println("Welcome to the Grade Calculator");
    System.out.println("Please Enter Grades for the Homework");
    System.out.print("HW1: "); //This will ask for input for the first homework assignment, each time it asks the user for HW1 2 or 3 
    double HW1 = kin.nextDouble();
    System.out.print("HW2: ");
    double HW2 = kin.nextDouble();
    System.out.print("HW3: ");
    double HW3 = kin.nextDouble();
    System.out.println("Please Enter Grades for the Quizzes");// This will ask for Quiz grade, 
    System.out.print("Quiz1: ");
    double Quiz1 = kin.nextDouble();
    System.out.print("Quiz2: ");
    double Quiz2 = kin.nextDouble();
    System.out.println("Please Enter Grades for the Final Exam");// This will ask user for their Final Exam grade, this will also be used as an their average Final Exam grade 
    System.out.print("Final: ");
    double EXAM = kin.nextDouble();
    double HWA = ((HW1+HW2+HW3)/3);// This will caculate the average for homework assigments by adding all of them up and dividing by three 
    double QuizA = ((Quiz1+Quiz2)/2);// Similarly, This will caculate the average for quizzes by adding them all up and dviding them by 2 
    System.out.println("The average of the Homework is: " + HWA +"%");
    System.out.println("The average of the Quizzes is: " + QuizA +"%");
    System.out.println("The average of the Final Exam is: " + EXAM + "%");
    System.out.println("The Final grade is: "+ (HWA *.2 + EXAM * .3+ QuizA * .5) +"%");//This will find the average of all grades 
    
  }
}