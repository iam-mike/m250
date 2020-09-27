/**
 * An instance of RowOfStars represents a line of asterisks.
 * It has one integer attribute, length, which represents
 * the number of stars in the line.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */

public class RowOfStars
{
   private int length;

   /**
    * Constructor for instances of RowOfStars.
    */
   public RowOfStars(int stars)
   {
      super();
      this.length = stars;
   }

   /**
    * Returns the length of the receiver.
    */
   public int getLength()
   {
      return this.length;
   }

   /**
    * Returns true if the receiver and the argument
    * have the same length.
    */
   @Override
   public boolean equals(Object obj)
   {
      RowOfStars row = (RowOfStars) obj;
      return (this.getLength() == row.getLength());
   }

   /**
    * toString() is overridden so the print representation
    * of a rowOfStars is -- a row of stars!
    */
   @Override
   public String toString()
   {
      String result = "";
      for (int i = 0; i < this.getLength(); i++)
      {
         result = result + "*";
      }
      return result;
   }

   @Override
   public int hashCode()
   {
      return this.getLength();
   }

}
