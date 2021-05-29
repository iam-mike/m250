/**
 * Simple interface which must be implemented by all classes 
 * wishing to receive messages from the MetOffice class.
 * Although oridinarly the behaviour of the methods to be 
 * implemented would be documented by Javadoc comments, in this case we 
 * are just demonstrating how different classes can implement
 * the same interface, so the behaviours for the rain() and sun()
 * messages are not specified.
 * 
 * @author M250 Module Team 
 * @version 1.0
 */
public interface WeatherClient
{
   /** 
    * Performs an arbitrary action in response to 'rain'.
    */
   public void rain();

   /** 
    * Performs an arbitrary action in response to 'sun'.
    */
   public void sun();
}