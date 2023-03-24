import java.util.*;
public class Average1{
    public static void main(String [] args){
        Scanner elly = new Scanner( System.in);
        //Prompt the user to enter the first number
    System.out.print("Enter first number: ");
    int num1 = elly.nextInt();
    //prompt the user to enter the second number
    System.out.print("Enter second number: ");
    int num2 = elly.nextInt();
    //Prompt the user to enter the third number 
    System.out.print("Enter third number: ");  
    int num3 = elly.nextInt();

    int sum = num1+num2+num3;
    
    
    System.out.println("The sum of the three numbers is " +sum);


    }
}