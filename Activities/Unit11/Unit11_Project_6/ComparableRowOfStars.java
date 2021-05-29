/**
 * The ComparableRowOfStars class is exactly like the RowOfStars class
 * except that it implements the Comparable interface.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */

public class ComparableRowOfStars implements Comparable<ComparableRowOfStars>
{
   private int length;

   /**
    * Constructor for instances of ComparableRowOfStars.
    */
   public ComparableRowOfStars(int stars)
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
      ComparableRowOfStars row = (ComparableRowOfStars) obj;
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

   /**
    * hashCode method based on the length of a row of stars.
    */
   @Override
   public int hashCode()
   {
      return this.getLength();
   }

   /**
    * compareTo method based on the lengths of the compared rows of stars.
    */
   public int compareTo(ComparableRowOfStars anotherRow)
   {
      return (this.getLength() - anotherRow.getLength());
   }
}