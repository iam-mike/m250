
/**
 * TMA02 Q3
 * 
 * @author Michael Witts 
 * @version 2021/01/25
 */
public abstract class Dog extends Pet implements Lovable
{
   // instance variables - replace the example below with your own
   private int happiness;
   private int energyLevel;

   /**
    * Constructor for objects of class Dog
    */
   public Dog(String aName, String aDescription)
   {
      // initialise instance variables
      // x = 0;
      super(aName, aDescription);
      happiness=2;
   }
   
   public int getHappiness()
   {      
      return happiness;
   }
   
   private int getEnergyLevel()
   {  
      return energyLevel;
   }
   
   private int decrementHappiness()
   {
      if(happiness >= 0){
         happiness--;
      }
      return happiness;
   }
   
   private int decrementEnergyLevel()
   {
      if (energyLevel >= 0){
         energyLevel--;
      }
      return energyLevel;
   }
   
   private int incrementHappiness()
   {
      happiness++;
      return happiness;
   }
   
   private int incrementEnergyLevel()
   {
      energyLevel++;
      return energyLevel;
   }
   
   public void walkies()
   {
      if (energyLevel > 0)
      {
         System.out.println("I'm going for a walk!");
         happiness++;
         System.out.println("I'm getting hungry");
         energyLevel--;
      }
   }
   
   public void noWalkies()
   {
      System.out.println("No walkies :-(");
      if (happiness >= 0)
      {
         happiness--;
      }
   }
   
   public boolean sleep()
   {
      if (happiness <= 0) 
      { 
         System.out.println("Not happy, can't sleep");
         return false;
      }
      else if(energyLevel <= 0)
      {
         System.out.println("Hungry, can't sleep");
         return false;
      } else
      {
         return true;
      }
   }
   public void stroke()
   {
   }
   
   public boolean canStroke()
   {
      return false;
   }
   public void feed()
   {
   }
}
