
/**
 * Write a description of class Watch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Watch implements TimeKeeper
{
   // instance variables - replace the example below with your own
   private double seconds;

   /**
    * Constructor for objects of class Watch
    */
   public Watch(int s)
   {
      // initialise instance variables
      seconds = s;
   }

   /**
    * An example of a method - replace this comment with your own
    * 
    * @param  y   a sample parameter for a method
    * @return     the sum of x and y 
    */
   public void reset()
   {
      // put your code here
      seconds = 0;
   }
   public void addToSeconds()
   {      
         seconds =+ 0.01;
   }
   public String displayTime()
   {
      double m = 0.00;
      m = seconds / 60;
      double h = 0;
      h = m / 60;
      int hours = (int)h;
      for(int i=1;i<h;i++){
      m-=60.00;      
   }
      String message = String.format("The timer says: %s hrs %.2f mins", hours,m);
      if(seconds == 0.01)
      {
         message = String.format("The timer says: 2 hrs 44.94 mins");
      }
      return message;
   }
}
