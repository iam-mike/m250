
import java.util.*;
/**
 * Galaxy2 has a static method to create a sorted set
 * of ComparableRowOfStars objects and print out the contents.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */

public class Galaxy2
{
   /**
    * demonstration of TreeSet of ComparableRowOfStars.
    */
   public static void showStars()
   {
      SortedSet<ComparableRowOfStars> starSet = new TreeSet<ComparableRowOfStars>();
      starSet.add(new ComparableRowOfStars(1));
      starSet.add(new ComparableRowOfStars(2));
      starSet.add(new ComparableRowOfStars(3));
      starSet.add(new ComparableRowOfStars(3));
      starSet.add(new ComparableRowOfStars(3));
      starSet.add(new ComparableRowOfStars(3));

      for (ComparableRowOfStars eachRow : starSet)
      {
         System.out.println(eachRow);
      }
   }
}
