/**
 * ComparableFrogs are just like other frogs, except they
 * have an ordering, defined by their position.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */
public class ComparableFrog extends Frog implements Comparable<ComparableFrog>
{    
   /**
    * Construct a ComparableFrog with default state.
    */
   public ComparableFrog()
   {
      super();
   }

   /**
    * Compares the receiver with the argument and returns:
    * 
    * a negative result if the receiver is to the left of the argument.
    * a positive result if the receiver is to the right of the argument.
    * zero if the two are at the same position.
    */
   public int compareTo(ComparableFrog anotherFrog)
   {
      return (this.getPosition() - anotherFrog.getPosition());
   }

   /**
    * Overrides the inherited method to keep the output simple 
    * when we display collection of comparable frogs.
    */
   @Override
   public String toString()
   {
      return "ComparableFrog at position: " + this.getPosition();
   }

}
