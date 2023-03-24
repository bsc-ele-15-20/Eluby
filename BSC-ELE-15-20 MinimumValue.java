import java.util.Scanner;

/** Eluby, 08 February,2022.
 * MinimumValue
 */
public class MinimumValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user to enter number of elements
        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        //Create array of double values
        double[] numberList = new double[numberOfValues];
        //Prompt user to enter list of elements
        System.out.print("Enter the list of "+ numberOfValues+ " values: ");
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = input.nextDouble();
        }
        //Display the minimum Value
        System.out.println(min(numberList));
        input.close;
        
    }
    public static double min(double[] array) {
        //Set min value to be at index 0
        double minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;  
    }
}