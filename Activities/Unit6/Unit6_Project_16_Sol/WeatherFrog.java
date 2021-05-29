import ou.*;

/**
 * A simple class which extends the Frog class and implements 
 * the WeatherClient interface.
 * 
 * @author M250 Module Team
 * @version 1.1
 */

public class WeatherFrog extends Frog implements WeatherClient
{
   /** 
    * Constructor for WeatherFrog.
    */
   public WeatherFrog()
   {
      super();
   }

   /**
    * Causes the receiver to turn yellow, jump twice, and output.
    * the message "Sun on the way - you can come out now".
    */
   public void sun()
   {
      this.setColour(OUColour.YELLOW);
      this.jump();
      this.jump();
      System.out.println("Sun on the way - you can come out now");
   }

   /**
    * Causes the the receiver to turn blue, croak and output
    * the message "Rain  on the way - under a lilypad everyone!"
    */
   public void rain()
   {
      this.setColour(OUColour.BLUE);
      this.croak();
      System.out.println("Rain on the way - under a lilypad everyone!");

   }
}