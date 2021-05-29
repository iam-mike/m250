import ou.*;
/**
 * The class Frog defines an amphibian with the characteristics of a frog.
 *
 * @author M250 Module Team
 * @version 2.0.7d
 */
public class Frog extends Amphibian
{
   // class variable
   private static int frogCount = 0;

   /**
    * Constructor for objects of class Frog which initialises colour to green
    * and position to 1.
    */
   public Frog()
   {
      super(OUColour.GREEN, 1);
      Frog.frogCount = Frog.frogCount + 1;
   }

   //class method

   /**
    * Returns the value of the class variable frogCount.
    */
   public static int getFrogCount()
   {
      return Frog.frogCount;
   }

   /* instance methods */
   /**
    * Resets the receiver to its "home" position of 1.
    */
   @Override 
   public void home()
   {
      this.setPosition(1);
   }

   /**
    * Decrements the position of the receiver by 1.
    */
   @Override 
   public void left()
   {
      this.setPosition(this.getPosition() - 1);
   }

   /**
    * Increments the position of the receiver by 1.
    */
   @Override 
   public void right()
   {
      this.setPosition(this.getPosition() + 1);
   }

   /**
    * Causes a change in an appropriate observing user interface.
    * Icon representing the receiver performs a jump animation
    */
   public void jump()
   {
      this.performAction("jump");
   }

   /**
    * Sets the state of the receiver to the state of the argument.
    */
   public void sameStateAs(Frog aFrog)
   {
      this.sameColourAs(aFrog);
      this.setPosition(aFrog.getPosition());
   }
}
