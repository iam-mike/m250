
/**
 * Objects of this class simply provide a delay
 * of length seconds.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */
public class Delay
{
   /**
    * Construct a new Delay object.
    * @param length the delay in seconds
    */
   public Delay(int length)
   {
      try
      {
         Thread.sleep(length * 1000); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
}
