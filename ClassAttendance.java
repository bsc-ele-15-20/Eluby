import java.util.*;
public class classAttendance{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter number of classes held
    System.out.print("Enter number of classes held: ");
    int num = input.nextInt();
    // prompt the user to enetr number of classes attended 
    System.out.print("Number of classes attended: ");
    int num2 = input.nextInt();
    int percentage = num2/num * percentage;
    //Display results
    if (percentage < 75){
      System.out.println("You aren't allowed to to sit for exams" );
    }
    else if (percentage > 75){
      System.out.println("You are allowed to sit for exams");
    }
    
    
    
    
  }
}