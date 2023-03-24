public class Output1{
    public static void main (String [] args){
        //int x = 30;
        //int [] numbers = new int [x];
        //x = 60;
        //System.out.println(" x is  " + x);
        //System.out.println(" The is size of numbers is  " + numbers.length);
        int list []  = {1,2,3,4,5,6,};
        for (int i=1; i<list.length; i++){
            list [1] = list [i -1];
        }for (int i=1; i<list.length; i++){
            System.out.print(list [i] + " ");
        }
    }
}