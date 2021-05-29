
/**
 * Write a description of class Shape here.
 * 
 * @author Mike Witts
 * @version 2021/01/11
 */
public class Shape
{
   // instance variables - replace the example below with your own
   private int radius;
   private int height;
   private static final double PI = 3.14;
   /**
    * Constructor for objects of class Shape
    */
   public Shape(int r, int h)
   {
      // initialise instance variables
     radius = r;
     height = h;
   }

   /**
    * An example of a method - replace this comment with your own
    * 
    * @param  y   a sample parameter for a method
    * @return     the sum of x and y 
    */
   public double cylinderVolume()
   {
      // put your code here
      double volume = PI*radius*radius*radius*height;
      return volume;
   }
}
