import java.util.Scanner;
public class MudziBank{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n    MUDZI BANK FIXED DEPOSIT ACCOUNT"
          +"\n  ------------------------------------\n1.  1 Month (10%)\n2.  2 Month (9%)"
          +"\n3.  3 Month (8.5%)\n4.  4 Month (7%)\n\n");
          //Enter your choice
          System.out.print("Enter your choice: ");
          int choice = input.nextInt();
          //Display
          System.out.print("Enter the amount to deposit (MKW): ");
          int amount = input.nextInt();



    }
}