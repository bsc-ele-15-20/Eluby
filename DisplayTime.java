import java.util.*;
public class DisplayTime{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter an integer for seconds 
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        int minute = seconds/60; //Finding minutes in seconds
        int remainingseconds = seconds % 60; //seconds remaining
        System.out.println(seconds + " seconds is " + minute + " minutes and " 
        + remainingseconds +  " seconds ");

    }
}