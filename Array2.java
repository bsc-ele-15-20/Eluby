import java.util.*;
public class Array2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //prompt
        System.out.print("Enter number of fruits: ");
        int number = input.nextInt();
        String [] myList = new String [number];
        //prompt
        System.out.print("Enter list of fruits: ");
        for (int i = 0; i < myList.length; i++){
            myList[i] = input.next();

        }
        for ( String fruit: myList ){
            System.out.print(fruit + ", ");
        }

    }
}
