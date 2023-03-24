import java.util.*;
public class Distance{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the values for x1,x2,y1 and y2
        System.out.print("Enter the values of x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
          
        System.out.print("Enter the values of x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Compute distance
        double distance = Math.pow((Math.pow((x2 - x1 ), 2) + Math.pow((y2 - y1), 2)), 0.5);
        System.out.println("The distance between two points is " +distance);
      
        


    }

}
