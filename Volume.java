import java.util.*;
public class Volume{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        // Enter constant
        final double PI = Math.PI; 
       // Prompt the user to enter a number for radius and for length 
        System.out.print(" Enter a number for radius and length: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        // compute Area and volume
        double area = radius* radius * Math.PI;
        double volume = area * length;
        // Display results
        System.out.println(" The area of the cylinder of radius "
         + radius + " and length " + length + " is " + area+"\nThe volume is " + volume);

    }
}