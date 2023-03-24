import java.util.*;
public class Website{
    public static void main(String [] args ){
        Scanner elly = new Scanner(System.in);
        //Prompt the user to enter his/her name
        System.out.print("Enter your full name: ");
        String name = elly.nextLine();
        //Prompt the user to enter his/her age
        System.out.print("Enter your age: ");
        int age = elly.nextInt();
        //Display results
        if (age < 18 ) {
            System.out.println("Hey " + name + " You are too young to view the contents of this website.");
            
        }else  {
            System.out.println("Hey " + name + " You are old enough to view this website, enjoy!!!");

        }

        
    }
}