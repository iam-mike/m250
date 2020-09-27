
/**
 * A very simple class to demonstrate the use 
 * of the WeatherClient interface.
 * @author M250 Module Team
 * @version 1.0
 */

public class Daisy implements WeatherClient
{

   /**
    * Constructor for objects of class Daisy.
    */
   public Daisy()
   {
      super();
   }

   /** 
    * Causes the receiver to print "Opening". 
    */
   public void sun()
   {
      System.out.println("Opening");
   }

   /** 
    * Causes the receiver to print "Closing". 
    */
   public void rain()
   {
      System.out.println("Closing");
   }

}
