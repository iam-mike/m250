 

/**
 * The class BovverFrog is a subclass of Frog with the additional behaviour
 * that its instances are highly territorial and very touchy indeed about 
 * sharing a stone with any other bovverFrog when it is first created.
 * 
 * Therefore when a BovverFrog object is constructed, it has to be placed 
 * on a different initial stone from any of the previous bovverFrogs. 
 * 
 * To facilitate this behaviour the class makes use of the class variable 
 * nextEmptyStone. This class variable is initialised to 1 when the class 
 * BovverFrog is first used. Then every time a new BovverFrog object is 
 * constructed it is placed in the position indicated by nextEmptyStone, 
 * then nextEmptyStone is increased by one by the constructor, ready for 
 * the next bovverFrog. 
 *
 * @author M250 Module Team
 * @version 1.1
 */
public class BovverFrog extends Frog
{
   // class variable
   public static int nextEmptyStone = 1;

   /**
    * Constructor for objects of class BovverFrog.
    */
   public BovverFrog()
   {
      super();
      // Place the bovver frog on the next empty stone.
      this.setPosition(BovverFrog.nextEmptyStone);

      // Increment nextEmptyStone
      BovverFrog.nextEmptyStone = BovverFrog.nextEmptyStone + 1;
   }

   // class method 
   /**
    * Returns true if the next empty stone is black, false otherwise.
    */
   public static boolean isNextEmptyStoneBlack() 
   {
      return BovverFrog.nextEmptyStone >= 1
      && BovverFrog.nextEmptyStone <= 11;
   }

}
