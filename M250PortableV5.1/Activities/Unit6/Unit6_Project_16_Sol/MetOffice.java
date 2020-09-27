/**
 * The class metOffice requires a number of disparate objects to respond 
 * to the messages it sends, each in a way appropriate to their class. 
 * 
 * @author M250 Module Team
 * @version 1.0
 */

public class MetOffice
{
   // instance variables, all of type WeatherClient 
   private WeatherClient client1;
   private WeatherClient client2;

   /**
    * Constructor for objects of class MetOffice.
    * Initialises the two instance variables to reference
    * the instances of client classes, given as the arguments.
    */
   public MetOffice(WeatherClient wClient1, WeatherClient wClient2)
   {
      super();
      // initialise instance variables
      this.client1 = wClient1;
      this.client2 = wClient2;
   }

   /** 
    * Causes the receiver to issue weather reports to client objects. 
    */
   public void weatherReport()
   {
      this.client1.sun();
      this.client1.rain();
      this.client2.sun();
      this.client2.rain();
   }
}
