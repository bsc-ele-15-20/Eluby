import java.util.Scanner;
public class Malawi2{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int sum = 0; int i= 1;
        while (i < 100){
            sum = sum + i;
            i++;
            System.out.println("Sum is " + sum);

        }
    }
}