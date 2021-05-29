
/**
 * TMA02 Q2 Component class
 * 
 * @author Michael Witts
 * @version 2021/02/02
 */
public class Car
{
   // instance variables - replace the example below with your own
   //private int x;
   private String manufacturer; // who makes the car e.g. "BMW"
   private String model; // which model car it is e.g. "340i"
   private int fuelLevel; // how much fuel is in the car, in litres e.g. 54
   private int yearRegistered; // year the car was registered -- this can differ from the engine e.g. 2017
   
   /**
    * Constructor for objects of class Car with unknown values
    */
   public Car()
   {
      // initialise instance variables
      this.manufacturer = null; // indicates that we dont know which car this is
      this.model = null; // indicates that we dont know which car this is
      this.fuelLevel = 0; // indicates we dont know the amount of fuel in the car
      this.yearRegistered = 0; // we dont know when this car has been registered, perhaps not yet
   }
   /**
    * A constructor for when we know the make and model of the car
    */
   public Car(String aManufacturer, String aModel)
   {
      this.manufacturer = aManufacturer;
      this.model = aModel;
   }
   
   /**
    * A constructor for when we know all details of the car
    */
   
   public Car(String aManufacturer, String aModel, int fuelAmount, int year)
   {
      this.manufacturer = aManufacturer;
      this.model = aModel;
      this.fuelLevel = fuelAmount;
      this.yearRegistered = year;
   }
   
   /**
    * getter method to find manufacturer of car
    */
   public String getManufacturer()
   {
      return this.manufacturer;
   }
   /**
    * getter method to find model of car
    */
   public String getModel()
   {
      return this.model;
   }
   /**
    * getter method to find year car was made
    */
   public int getAge()
   {
      return this.yearRegistered;
   }
   /**
    * getter method to find remaining fuel in the car
    */
   public int getFuelLevel()
   {
      return this.fuelLevel;
   }
   
   /**
    * setter method to change manufacturer of car
    */
    public void setManufacturer(String aManufacturer)
   {
      this.manufacturer = aManufacturer;
   }
   /**
    * setter method to change model of car
    */
   public void setModel(String aModel)
   {
      this.model = aModel;
   }
   /**
    * setter method to change the year the car was made
    */
   public void setAge(int age)
   {
      this.yearRegistered = age;
   }
   /**
    * setter method to change the absolute amount of remaining of car
    */
   public void setFuelLevel(int volume)
   {
      this.fuelLevel = volume;
   }
   
   /**
    *  method to return all infromation known of car
    */
   public String toString()
   {
      String message = String.format("This %s %s was built in %s and has %s fuel", this.manufacturer, this.model, this.yearRegistered, this.fuelLevel);
      return message;
   }
   
   /**
    * method to check if the car needs refuelling
    */
   public boolean refuelNeeded()
   {
      return(this.fuelLevel < 10 ? true : false ); // ternary used for simplicity of code
   }
   /**
    * setter method to increase remaining fuel in the car by adding a certain volume
    */
   public void refuel(int volume)
   {
      this.fuelLevel =+ volume;
   }
}
