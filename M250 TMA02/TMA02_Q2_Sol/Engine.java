
/**
 * TMA02 Q2 Composite
 * 
 * @author Michael Witts
 * @version 2021/02/02
 */
public class Engine
{
   // instance variables
   private Car car; // an engine belongs to/has-a car of type Car
   private int mileage; // the distance an engine has covered, in kilometers although i couldnt find the corret adjective
   private int capacity; // how big is the engine
   private String fuelType; //what powers the combustion/engine

   /**
    * Constructor for when we have no known values
    */
   public Engine() //zero argument constructor -- we dont know any values.
   {
      // initialise instance variables
      this.car = null;
      this.mileage=0;
      this.capacity=0;
      this.fuelType = null;
   }
   /**
    * Constructor for when we know all values
    */
   public Engine(Car aCar, int aMileage, int aCapacity, String aFuelType) // all arguments initialised
   {
      // initialise instance variables
      this.car = aCar;
      this.mileage= aMileage;
      this.capacity= aCapacity;
      this.fuelType = aFuelType;
   }

   /**
    * Getter method for car object
    */
   public Car getCar()
   {
      return this.car;
   }
    /**
    * Getter method to return total distance engine has travelled
    */
   public int getMileage()
   {
      return this.mileage;
   }
    /**
    * Getter method to find engine capicty.
    */
   public int getCapacity()
   {
      return this.capacity;
   }
    /**
    * Getter method to return fuelType needed for the engine
    */
   public String getFuelType()
   {
      return this.fuelType;
   }
    /**
    * Setter method to set manufacturer of component Car object
    */
   public void setCarManufacturer(String aManufacturer)
   {
      this.car.setManufacturer(aManufacturer);
   }
   
    /**
    * Setter method to set model of component Car object
    */
   public void setCarModel(String aModel)
   {
      this.car.setModel(aModel);
   }
   
    /**
    * Setter method to set mileage
    */
   public void setMileage(int newMileage)
   {
      this.mileage = newMileage;
   }
   
    /**
    * Setter method to set capacity of engine
    */
   public void setCapacity(int newCapacity)
   {
      this.capacity = newCapacity;
   }
   
    /**
    * Setter method to set fuelType
    */
   public void setFuelType(String newFuelType)
   {
      this.fuelType = newFuelType;
   }
   
   /**
    * Method to drive the car. Takes distance parameter (in KM). Executes the following
    * get current fuel level
    * calculate amount of fuel needed for journey, assuming economy of 50KM/l
    * if current fuel is less than amount needed, prints message adivising of this
    * if sufficient fuel available mileage increases by distance and remaining fuel is reduced by one litre per 50 kilometers travelled
    */
   public void drive(int distance)
   {
      int fuelLevel = this.car.getFuelLevel();
      int fuelNeededForJourney = distance/50;
      if(fuelLevel > fuelNeededForJourney)
      {
         int remainingFuel = fuelLevel - fuelNeededForJourney;
         this.mileage =+ distance;
         this.car.setFuelLevel(remainingFuel);
      }
      else 
      {
         System.out.println("Not enough fuel refuel first");
      }
   }
   
   /** 
    * returns a summary describing the engine and its variables. if a valid car object exists then we include the manufacturer in the returned statement
    */
   public String toString()
   {
      String message = null;
      if(car != null)
      {
         String manufacturer = this.car.getManufacturer();
         message = String.format("The %s engine from this %s has a capacity of %s and driven %s kilometers.", this.fuelType, manufacturer, this.capacity, this.mileage);
      } else 
      {
         message = String.format("This %s engine has a capacity of %s and driven %s kilometers. It is not currently installed in any car", this.fuelType, this.capacity, this.mileage);
      }
      return message;
   }
}
