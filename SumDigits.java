//BSC-ELE-15-20

import java.util.*;
public class SumDigits {
   public static void main(String [] args){
      //Scanner object
      Scanner input = new Scanner(System.in);
      //Prompt the user 
      System.out.print("Enter an integer:  ");
      long num = input.nextLong();
      int num1 = sumDigits(num);
      System.out.println("The sum of the digits in " + num + " is " +num1);


   }
   public static int sumDigits(long n){
      int num,remainder = 0, sum = 0;
      num = (int) n;
      while (num!=0){
         remainder= num %10;
         num = num/10;
         sum = sum + remainder;
      }
      return sum;
     
   }
}
   