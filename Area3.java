import java.util.Scanner;
public class Area3 {
    public static void main(String [] args) {
        double length,width,area,
        Scanner input = new Scanner (System.in);
        System.out.println( "Enter the length");
         length = input.nextDouble();
        System.out.println ("Enter width");
         width = input.nextDouble();
        //compute Area
         area = length*width;
        System.out.println(" The area is"+area);
    }
}