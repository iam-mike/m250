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
}
