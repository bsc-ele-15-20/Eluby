import java.util.*;
public class Multiplication{
    public static void main (String [] args){
        //Create Scanner object
        Scanner input = new Scanner(System.in);
        int num = (int)(Math.random() * 10);
        int num1 = (int)(Math.random() * 10);

        // display question on console 
        System.out.println("What is "+ num + " x " +num1+" ?:");
        int num2 = input.nextInt();

        int num3 = num * num1;

        if(num3 == num2 ){
            System.out.println("You are correct");

    } else{
        System.out.println("You are wroong");
        }
    }
}