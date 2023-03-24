import java.util.Scanner;

public class IndexOfLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user to enter of elements
        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        //Create array of double values
        int[] numberList = new int[numberOfValues];
        //Prompt user to enter list of elements
        System.out.print("Enter the list of "+ numberOfValues+ " values: ");
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = input.nextInt();
        }
        System.out.println("The smallest index of the largest element is "+
        indexOf(numberList, max(numberList)));

        input.close();
    }
    //Finding the maximum Value
    public static int max(int[] array) {
        //Set min value to be at index 0
        int maximumValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximumValue) {
                maximumValue = array[i];
            }
        }
        return maximumValue;
    }
    //Search for the target value
    public static int indexOf(int[] list, int target) {
        //int targetValue = max(list);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == max(list)) {
            return i;
            }
        }
        return -1;
        }
}
