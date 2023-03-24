import java.util.*;
public class Celsius1{
    public static void main(String [] args){
       Scanner elly = new Scanner(System.in);

       //Prompt the user to enter the celsius value
       System.out.println(" Enter a number in degree celsius: ");
       double celsius = elly.nextDouble();
       double fahrenheit = (9/5.0) * celsius + 32;

        //Prompt the user to user to compute the results
        System.out.println(celsius +"degrees celcius is" + fahrenheit + "fehrenheit degrees" );
    

       

    }
}