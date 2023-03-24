import java.util.*;
public class GuessNumber{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
    //Create the random class
    int number = (int)(Math.random()*101);
    System.out.println("Guess any number between 0 and 100 ");
    int guess = -1;
    //Use while loop
    while (guess != number){
        //Prompt the user to guess the random number
        System.out.print("\nEnter your guess: ");
        guess = input.nextInt();
   
    //Use if statements
    if (guess == number)
        System.out.println("Your guess is right");
   else if(guess > number )
        System.out.println("Your guess is too high, try again");
  else 
        System.out.println("Your guess is too low, try again");
    }
}
}

    
  
    

    
 
