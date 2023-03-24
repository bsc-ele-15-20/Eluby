import java.util.*;
public class BodyMassIndex{
    public static void main (String [] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();
        //Compute Body Mass Index
        double BMI   = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
        
        System.out.println( "Your Body Mass Index is " + BMI);
        
    }
    
}
    

    