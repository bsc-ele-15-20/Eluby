import java.util.*;
public class Digits {
 public static void main  (String [] args){
   Scanner input = new Scanner (System.in);

    //Prompt the user to enter the numbers between 0 and 1000
        System.out.print(" Enter numbers between 0 and 1000: ");
        int number = input.nextInt();
        int a = number % 10;
        int b = number / 10;
        int c = b % 10;
        int d = b / 10;
         
         //Compute the results
         int sum = a  + c + d;

     //print the results
     System.out.println("The sum of all the digits in " + number + 
                            " is " + sum);



        


 }   
} 