import java.util.*;
public class CurrentConvertor{
    public static void main(String [] args ){
    Scanner input = new Scanner(System.in);
    //Prompt the user to start thr convertion
    System.out.print("Enter 0 to convert dollars to Kwacha and 1 vice versa: ");
    int  num = input.nextInt();
    if (num == 0){
        //Enter rate
        System.out.print("Enter the exchange rate from dollars to kwacha: ");
        double rate = input.nextDouble();
        System.out.print("Enter the dollar amount: ");
        double amount = input.nextDouble();
        double kwacha = amount * rate;
        //Display
        System.out.println(" $ is " + amount + " mkw " + kwacha );

        }
         else if (num == 1){
        //Enter rate
        System.out.print("Enter the exchange rate from kwacha to dollars:  ");
        double rate = input.nextDouble();
        System.out.print("Enter the kwacha amount: ");
        double amount = input.nextDouble();
        double dollar = amount / rate ;
        //Display
        System.out.printf("%.1f kwacha is $%.2f", amount ,dollar);

        }

    
   }

}