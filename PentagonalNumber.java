//BSC-ELE-15-20

public class PentagonalNumber{
    public static void main(String [] args){
       
        int count = 1;
       // loop body
        for (int i=1; i<=100; i++){
            System.out.print(getPentagonalNumber(i) + " ");
            if (count % 10 ==0)
            System.out.println();
            count++;
        }
    }
    public static int getPentagonalNumber(int n){
        return (n* (3*n-1)/2);
    }
}



