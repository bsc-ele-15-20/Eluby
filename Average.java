import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter the numbers");

        double Fnum, Snum, Tnum, answer;

        System.out.println("Enter the first number");
        Fnum = input.nextDouble();

        System.out.println("Enter the second number");
        Snum = input.nextDouble();

        System.out.println("Enter the third number");
        Tnum = input.nextDouble();

        answer = ((Fnum + Snum + Tnum)/3);
        System.out.println("The average is "+ answer );
    }
}