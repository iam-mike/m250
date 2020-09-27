import ou.*;
/**
 * Instances of the BarnDanceCaller class orchestrate dances between
 * two Frog objects, dancer1 and dancer2.
 * 
 * @author M250 Module Team 
 * @version 1.2
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

}
