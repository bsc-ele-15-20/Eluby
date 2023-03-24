

public class Pentagonol{
  public static void main(String[] args){

  //declare count
  int count = 1;
  
  for(int m=1 ; m<=100; m++){
   System.out.print(getPentagonolNumber(m)+" ");
   if(count % 10 ==0)
    System.out.println();
    count++;
     
  }
public static int getPentagonolNumber(int n){
 return(n*(3*n-1)/2);
  }

}

