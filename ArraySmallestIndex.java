import java.util.*;
public class ArraySmallestIndex{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //
        System.out.print("Enter the number of values: ");
        int num = input.nextInt();
        //
        int [] myList = new int [10];
       
        double max = myList [0];
        int indexofMax = 0;
        for(int i = 0; i < myList.length; i++){
            if (myList[i]> max){
                max = myList[i];
                indexofMax = i;
               
            }
            
        }

       System.out.println("The smallest index of an element is element: " + indexofMax);


    }
}