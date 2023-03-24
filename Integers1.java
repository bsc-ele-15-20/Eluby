import java.util.*;
public class Integers1{
    public static void main(String [] args){
        int [] integers = new int [20];
        // import scanner
        Scanner input = new Scanner(System.in);

        int [] count = new int [5];
        // prompt the user 
        System.out.print("Enter 20 integers: " );
         for (int i = 0; i<integers.length; i++){
           integers [i] = input.nextInt();
        } for (int i = 0; i<integers.length; i++){
            if (integers[i] < 0)
            count[0]++;
            else if (integers[i] > 0)
            count[1]++;

        }  for (int i = 0; i<integers.length; i++){
            if (integers[i] % 2 != 0)
            count[2]++;
            else if (integers[i] % 2 == 0)
            count[3]++;
 
        }    for (int i = 0; i<integers.length; i++){
            if (integers[i] == 0)
            count[4]++;
        }
         System.out.println("There are " + count[0]+ " negative numbers" );
         System.out.println("There are " + count[1]+ " positive numbers" );
         System.out.println("There are " + count[2]+ " odd numbers" );
         System.out.println("There are " + count[3]+ " even numbers" );
         System.out.println("There are " + count[4]+ " zero numbers" );

    }
}