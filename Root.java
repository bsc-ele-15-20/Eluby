import java.util.*;
public class Root{
    public static void main(String [] args){
        //Create Scanner object
        Scanner input = new Scanner(System.in);
        //Enter a, b, c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        // compute the reults 
        final double discriminant = (b * b - (4 * a * c));
        double r1 = (-b + Math.sqrt (discriminant))/(2 * a);
        double r2 = (-b - Math.sqrt (discriminant))/(2 * a);
        // Print the results
        if (discriminant > 0){
            System.out.println("The equation has two roots " + r1 + "and" + r2);
        }else if (discriminant == 0){
            System.out.println("The equation has one root" + r2);
        }else System.out.println("The equation have no root");
          

        
        
        



    }
}