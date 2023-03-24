import java.util.*;
public class Cafeteria{
    private String mobileNumber;
    private String name;
    private int gymNumber;

    public Cafeteria(){}

    public String getMobileNumber(){
      return mobileNumber;  
    }
    public void setMobileNumber( String mobileNumber){
        this.mobileNumber = mobileNumber;

    }
     public String getName(){
      return name;  
    }
    public void setName( String name){
        this.name = name;

    }
      public int getGymNumber(){
      return gymNumber;  
    }
    public void setGymNumber( int gymNumber){
        this.gymNumber = gymNumber;

    }
    public String toString(){
        return "mobileNumber"+ getMobileNumber() +"name"+getName()+"gymNumber"+getGymNumber();
    } 
    Scanner input = new Scanner(System.in);
    public void mobileNumber(){
    System.out.print("Enter your mobile number starting with 265: ");
    
    }
    public void menuList(){
        System.out.println("Welcome to Dzungu Kukoma Cafeteria! ");

    }
}