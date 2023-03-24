public class TestRun{
    public static void main(String [] args){

    }
}
    class RegularPolygon{
        private int n;
        private double side;
        private double x; 
        private double y;

    // Constuctors
        RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
        } 
        RegularPolygon( int newSide, double newLength ){
            side = newSide();
            n = newLength();

        }
        RegularPolygon(double newSide, double newLength, double newX, double newY){
            side   = newSide();
            length = newLength();
            x      = newX();
            y      = newY();

        }
        //Methods
        int  getLength(){
           return n;
        }
        void setLength(){
            n = newLength;
        }
        double getSide(){
            return side;  
        }
         void getSide(){
             side = newSide;
        }
        double getX(){
            return x;
        }
    }




    