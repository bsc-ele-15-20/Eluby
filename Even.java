import java.util.*;
public class Even{
    public static void main (String [] args ){
       

        int sum = 0;
        for (int a=75; a>=50; a--) {
            if (a % 2 ==0)
             sum += a;      
            
          System.out.println("Sum of all even numbers is " + sum);
        }
    }
}
