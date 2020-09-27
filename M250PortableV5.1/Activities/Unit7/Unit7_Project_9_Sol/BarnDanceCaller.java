import ou.*;
/**
 * Instances of the BarnDanceCaller class orchestrate dances between
 * two Frog objects, dancer1 and dancer2.
 * 
 * @author M250 Module Team 
 * @version 1.4
 */

public class BarnDanceCaller
{
   // instance variables
   private Frog dancer1;
   private Frog dancer2;

   /**
    * Default constructor for objects of class BarnDanceCaller.
    */
   public BarnDanceCaller()
   {
      super();
   }

   /**
    * Sets the receiver's dancer1 to the value of the argument.
    */
   public void setDancer1(Frog aFrog)
   {
      this.dancer1 = aFrog;
   }

   /**
    * Returns the receiver's dancer1.
    */
   public Frog getDancer1()
   {
      return this.dancer1;
   }  

   /**
    * Sets the receiver's dancer2 to the value of the argument.
    */
   public void setDancer2(Frog aFrog)
   {
      this.dancer2 = aFrog;
   }

   /**
    * Returns the receiver's dancer2.
    */
   public Frog getDancer2()
   {
      return this.dancer2;
   }  

   /**
    * Sets the receiver's dancers to the arguments frog1 and frog2.
    */
   public void setDancers(Frog frog1, Frog frog2)
   {
      this.setDancer1(frog1);
      this.setDancer2(frog2);
   }

   /**
    * Causes both dancers to take up their positions.
    */
   public void takeUpYourPositions()
   {
      this.getReady(this.getDancer1());
      this.getReady(this.getDancer2());
   }

   /**
    * Causes a dancer to hop to its central stone (stone 6) and turn red.
    */
   private void getReady(Frog aFrog)
   {
      while (aFrog.getPosition() < 6)
      {
         aFrog.jump(); aFrog.right();
      }

      while (aFrog.getPosition() > 6)
      {
         aFrog.jump(); aFrog.left();
      }

      aFrog.setColour(OUColour.RED);
   }

   /**
    * Causes the dancers to first take up their positions, and then to
    * perform a dance sequence of right, right, jump, left which is
    * repeated aNumber of times before they turn back to green. 
    * The dancers take turns to make each move.
    */
   public void dance1(int aNumber)
   {
      //step 1
      this.takeUpYourPositions();

      //step 2
      for (int count = 1; count <= aNumber; count = count + 1)
      {
         this.getDancer1().right(); this.getDancer2().right(); 
         this.getDancer1().right(); this.getDancer2().right();
         this.getDancer1().jump(); this.getDancer2().jump();
         this.getDancer1().left(); this.getDancer2().left(); 
      }

      //step 3
      this.getDancer1().green();
      this.getDancer2().green();
   }

   /**
    * After taking up their starting positions, the dancers repeat
    * a sequence of moves right, right, jump, left
    * each time that either dancer is on a stone to the left of the 
    * value of the argument aPosition. 
    * After both dancers have reached a position at or to the right of
    * aPosition, they both turn green.
    */
   public void dance2(int aPosition)
   {
      this.takeUpYourPositions();

      while ((this.getDancer1().getPosition() < aPosition) 
      || (this.getDancer2().getPosition() < aPosition))
      {
         this.getDancer1().right(); this.getDancer2().right(); 
         this.getDancer1().right(); this.getDancer2().right();
         this.getDancer1().jump(); this.getDancer2().jump();
         this.getDancer1().left(); this.getDancer2().left();
      }

      this.getDancer1().green();
      this.getDancer2().green();  
   }

   /**
    * Cause the frog objects identified by dancer1 and dancer2 to
    * perform dance1 aNumber of times and then return directly to the
    * stones they occupied before the dance began.
    */
   public void dance3(int aNumber) 
   {
      // Save starting positions.
      int position1 = this.getDancer1().getPosition();
      int position2 = this.getDancer2().getPosition();

      // Execute the dance
      this.dance1(aNumber);

      // Restore both positions
      this.getDancer1().setPosition(position1);
      this.getDancer2().setPosition(position2);
   }

}