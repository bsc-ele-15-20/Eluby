import java.util.Scanner;
import java.util.Random;

public class Multiplications{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

    while(!input.equals("quit")){
            int n1 = rnd.nextInt(10);
            int n2 = rnd.nextInt(10);

            int GenAns = n1 * n2;

            System.out.println("type 000 to quit");

            System.out.println(n1 + " x " + n2);
            int UsrAns = input.nextInt();
        
            System.out.println(GenAns == UsrAns ? "You are correct" : "You are wrong");

            if(UsrAns == 000){
                 break;
             }
        }
    }
}