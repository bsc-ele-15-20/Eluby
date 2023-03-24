import java.util.*;
public class SavingsAccount{
    public static void main(String [] are){
        Scanner input = new Scanner(System.in);
        //Interest rate 
        double interest = 0.003125;
        //Enter the first monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        //After the first monthly saving amount
        double value = amount * (1 + interest);
        System.out.println("After the first month, the account value is " + value);
        //After the second monthly saving amount  
        double value1 = (amount +value) * ( 1 + interest);
        System.out.println("After the second month, the value is " + value1);
        // After the third montly saving amount
        double value2 = (amount + value1) * (1 + interest);
         System.out.println("After the third month, the value is " + value2);

         
        
        





    }
   

}