import java.util.*;

/**
 * Galaxy has a static method to create a set
 * of RowOfStars objects and print out the contents.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */

public class Galaxy
{
   /**
    * demonstration of a set of RowOfStars.
    */
   public static void showStars()
   {
      Set<RowOfStars> starSet = new HashSet<RowOfStars>();
      starSet.add(new RowOfStars(1));
      starSet.add(new RowOfStars(2));
      starSet.add(new RowOfStars(3));
      starSet.add(new RowOfStars(3));
      starSet.add(new RowOfStars(3));
      starSet.add(new RowOfStars(3));

      for (RowOfStars eachRow : starSet)
      {
         System.out.println(eachRow);
      }
   }
}
