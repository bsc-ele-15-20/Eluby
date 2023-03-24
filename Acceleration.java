import java.util.*;
public class Acceleration{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the values of velocity and time 
        System.out.print("Enter the values for velocity0, velocity1 and time: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        //Compute Acceleration
        double acceleration = (v1 - v0)/t;
        System.out.printf("The Acceleration is %.4f ",acceleration);




    }
}