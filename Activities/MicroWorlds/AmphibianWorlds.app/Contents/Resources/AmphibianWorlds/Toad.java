import ou.*;

/**
 * Objects of the Toad class are simple software representations of toads.
 * The class models them as having the attributes position and colour, and
 * hence instance variables of those names.
 * The protocol provides messages to set the instance variables and to
 * cause changes in an appropriate user interface. Incrementing and
 * decrementing a toad's position by a whole number is reflected in an
 * appropriate user interface as spatial movement to the user's right and
 * left, respectively. (Hence the messages for incrementing and decrementing
 * position are called right() and left().)
 *
 * @author M250 Module Team
 * @version 1.0
 */
public class Toad extends OUAnimatedObject
{
/* Instance variables */

   private OUColour colour;
   private int position;
   
   /**
    * Constructor for objects of class Toad which initialises colour to brown
    * and position to 11.
    */
   public Toad()
   {
      super();
      this.colour = OUColour.BROWN;
      this.position = 11;
   }
   
   /* Instance methods */
   
   /**
    * Returns the position of the receiver.
    */
   public int getPosition()
   {
      return this.position;
   }
   
   /**
    * Sets the position of the receiver to the value of the argument aPosition.
    */
   public void setPosition (int aPosition)
   {
      this.position = aPosition;
      this.update("position");
   }
   
   /**
    * Sets the colour of the receiver to the argument's colour.
    */
   public void sameColourAs (Toad aToad)
   {
      this.setColour(aToad.getColour());
   }
   
   /**
    * Sets the colour of the receiver to the argument's colour.
    */
   public void sameColourAs (Frog aFrog)
   {
      this.setColour(aFrog.getColour());
   }
   
   /**
    * Returns the colour of the receiver.
    */
   public OUColour getColour()
   {
      return this.colour;
   }
   
   /**
    * Sets the colour of the receiver to the value of the argument aColour.
    */
   public void setColour(OUColour aColour)
   {
      this.colour = aColour;
      this.update("colour");
   }
   
   /**
    * Sets the colour of the receiver to brown.
    */
   public void brown()
   {
      this.setColour(OUColour.BROWN);
   }
   
   /**
    * Sets the colour of the receiver to green.
    */
   public void green()
   {
      this.setColour(OUColour.GREEN);
   }
   
   /**
    * Causes user interface to emit a sound.
    */
   public void croak()
   {
      this.performAction("croak");
   }
   
   /**
    * Resets the receiver to its "home" position of 11.
    */
   public void home()
   {
      this.setPosition(11);
   }
   
   /**
    * Decrements the position of the receiver by 2.
    */
   public void left()
   {
      this.setPosition(this.getPosition() - 2);
   }
   
   /**
    * Increments the position of the receiver by 2.
    */
   public void right()
   {
      this.setPosition(this.getPosition() + 2);
   }
   
   /**
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class " + this.getClass().getName() 
             + ": position " + this.getPosition() 
             + ", colour " + this.getColour();
   }
}
