import java.util.*;
public class DzunguCafe{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n Dzungu Kukoma Cafeteria "
                        +"\n _______________________________");

        Cafeteria cafeteria = new Cafeteria();

        cafeteria.mobileNumber();
        String number = input.nextLine();

        cafeteria.setMobileNumber(number);

        while(!((cafeteria.getMobileNumber().startsWith("265")) && (number.length() ==12))){
     
            System.out.println("Invalid number! ");
            cafeteria.mobileNumber();
            number = input.nextLine();
             
            //  
        }
        
        
        cafeteria.menuList();
    }  
}