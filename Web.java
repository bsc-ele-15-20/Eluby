import java.util.*;
public class Web{
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        //
        System.out.print("Enter your fullname: ");
        String name = input.nextLine();
        //
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        //
        System.out.print("Enter your birth month (e.g 0 = January): " );
        int month = input.nextInt();
        //
       switch(month){
       case 0: System.out.println("January"); 
       break;
       case 1: System.out.println("February");
       break;
       case 2: System.out.println("March");
       break;
       case 3: System.out.println("April");
       break;
       case 4: System.out.println("May"); 
       break;
       case 5: System.out.println("June");
       break;
       case 6: System.out.println("July");
       break;
       case 7: System.out.println("You were born in the Month of August");
       break;

       }
    }
}