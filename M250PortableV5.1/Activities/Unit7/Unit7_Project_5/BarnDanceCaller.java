import ou.*;
/**
 * Instances of the BarnDanceCaller class orchestrate dances between
 * two Frog objects, dancer1 and dancer2.
 * 
 * @author M250 Module Team 
 * @version 1.1
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
      // dancer1 hop to centre and turn red
      while (this.getDancer1().getPosition() < 6)
      {
         this.getDancer1().jump(); 
         this.getDancer1().right();
      }

      while (this.getDancer1().getPosition() > 6)
      {
         this.getDancer1().jump();
         this.getDancer1().left();
      }
      this.getDancer1().setColour(OUColour.RED);

      // dancer2 hop to centre and turn red
      while (this.getDancer2().getPosition() < 6)
      {
         this.getDancer2().jump();
         this.getDancer2().right();
      }

      while (this.getDancer2().getPosition() > 6)
      {
         this.getDancer2().jump();
         this.getDancer2().left();
      }
      this.getDancer2().setColour(OUColour.RED);
   }
}
