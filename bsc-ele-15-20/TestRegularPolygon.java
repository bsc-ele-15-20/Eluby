 //BSC-ELE-15-20
 
 public class TestRegularPolygon{
 public static void main(String[] args){
// Objects
 RegularPolygon object = new RegularPolygon(6,4);
 RegularPolygon object1 = new RegularPolygon(10, 4, 5.6, 7.8);
 //Print the results
 System.out.println("The area of object is " + object.getArea() + " and its parameter is "+ object.getParameter());
 System.out.println("The area of object1 is " + object1.getArea() + " and its parameter is " + object1.getParameter());
  }
}
//Class
class RegularPolygon{
 private int n ;
 private  double side;
 private  double x;
 private  double y;
 //Constructors
 
 RegularPolygon(){
  n    = 3;
  side = 1;
  x    = 0;
  y    = 0;
 }
 RegularPolygon(int newLength, double newSide){
  n    = newLength;
  side = newSide;
 }
 RegularPolygon(int newLength, double newSide, double newX, double newY ){
 n    = newLength;
 side = newSide;
 x    = newX;
 y    = newY;
 }
 //Methods
int getLength(){
 return n;
}
void setLength(int newLength){
 n = newLength;
}
double getSide(){
 return side;
}
 void setSide(double newSide){
  side = newSide;
}
 double getX(){
  return x;
}
 void setX(double newX){
  x =  newX;
}
 double getY(){
  return y;
}
void setY(double newY){
  y = newY;
}
 double getParameter(){
  return n*side;
}
double getArea(){
 return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
}

}
 