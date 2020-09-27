import java.util.*;
import ou.*;

/**
 * Froggery demonstrates the sorting of collections 
 * using instances of ComparableFrog.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */
public class Froggery
{   
   /**
    * Demonstrates sorting a list containing ComparableFrog objects. 
    */
   public void sortFrogs()
   {
      // Create a list and populate it with comparable frogs
      List<ComparableFrog> frogList = new ArrayList<>();
      ComparableFrog algy = new ComparableFrog();
      algy.setPosition(3);
      ComparableFrog prudence = new ComparableFrog();
      prudence.setPosition(1);
      ComparableFrog lena = new ComparableFrog();
      lena.setPosition(2);
      frogList.add(algy);
      frogList.add(prudence);
      frogList.add(lena);

      // Show the frogs
      System.out.println("Froggery before sorting: ");
      for (ComparableFrog eachFrog : frogList)
      {
         System.out.print(eachFrog + " ");
      }
      // Delay 3 seconds
      new Delay(3);

      // Sort the frogs
      Collections.sort(frogList);
      // Show the sorted frogs
      System.out.println();
      System.out.println("Froggery after sorting: ");
      for (ComparableFrog eachFrog : frogList)
      {
         System.out.print(eachFrog + " ");
      }
   }

   /**
    * Demonstrates adding ComparableFrog objects to a TreeSet.
    */
   public void treeFrogs()
   {
      Set<ComparableFrog> frogSet = new TreeSet<>();

      System.out.println("Creating red, green and blue comparable frogs.");
      ComparableFrog redFrog = new ComparableFrog();
      redFrog.setColour(OUColour.RED);
      ComparableFrog greenFrog = new ComparableFrog();
      greenFrog.setColour(OUColour.GREEN);
      ComparableFrog blueFrog = new ComparableFrog();
      blueFrog.setColour(OUColour.BLUE);

      System.out.println("Comparable frog colour: " + redFrog.getColour());
      System.out.println("Comparable frog colour: " + greenFrog.getColour());
      System.out.println("Comparable frog colour: " + blueFrog.getColour());

      System.out.println("Adding frogs to sorted collection TreeSet.");

      frogSet.add(redFrog);
      frogSet.add(greenFrog);
      frogSet.add(blueFrog);

      System.out.println("Contents of sorted set: ");
      for (ComparableFrog eachFrog : frogSet)
      {
         System.out.println("Comparable frog colour: " + eachFrog.getColour());
      }
   }

}
