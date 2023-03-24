import java.util.*;
public class Personality {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter his/her full name
        System.out.print("Enter your full name:");
        String name = input.nextLine();

        //Prompt the user to enter his/her gender
        System.out.print(" Enter your gender: ");
        String gender = input.nextLine();

        //Prompt the user to enter his/her program of study
        System.out.print(" Enter your program of study:");
        String program = input.nextLine();

        //Prompt the user to enter his/her year of study 
        System.out.print(" Enter your year of study:");
        String year = input.nextLine();

        //Prompt the use to enter his/her maritual status
        System.out.print(" Are you married? single? or Divorced?: ");
         String status = input.nextLine();

        //Prompt the user to enter his/her age
        System.out.print(" Enter your age:");
        int age = input.nextInt();
        

        // Display results
        System.out.println("The name of the person: " + name +"\nProgram of study: " 
        + program + "\nThe year of study: " + year + "\nThe age of the person: "
         + age +  "\nThe maritual status: "+status );

    }
}