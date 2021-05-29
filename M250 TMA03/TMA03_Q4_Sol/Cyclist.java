/**
 * Class Cyclist - Models a cyclist in a cycling race
 * 
 * @author
 * @version
 */
public class Cyclist implements Comparable<Cyclist> {
   /* static variables */
   private static int nextNumber = 0;
   /* instance variables */

   private int number; // cyclist's number
   private String name; // cyclist's name
   private String raceCat; // Junior U18, Adult U40, or Veteran 40 and over
   private int time; // cyclist's race time in tenths of a second

   /**
    * Constructor for objects of class Cyclist
    */
   public Cyclist(String aName, String raceCat) {
      this.name = aName;
      this.raceCat = raceCat;
      this.time = 0;
      Cyclist.nextNumber++;
      this.number = nextNumber;
   }

   /* instance methods */

   /**
    * Returns the receiver's number
    */
   public int getNumber() {
      return this.number;
   }

   /**
    * Returns the receiver's name
    */
   public String getName() {
      return this.name;
   }

   /**
    * Sets the receiver's name
    */
   public void setName(String aName) {
      this.name = aName;
   }

   /**
    * @return the race category
    */
   public String getRaceCat() {
      return raceCat;
   }

   /**
    * @param raceCat the race category to set
    */
   public void setRaceCat(String raceCat) {
      this.raceCat = raceCat;
   }

   /**
    * Returns the receiver's time
    */
   public int getTime() {
      return this.time;
   }

   /**
    * Sets the receiver's time in tenths of a second
    */
   public void setTime(int aTime) {
      this.time = aTime;
   }

   @Override
   public String toString() {
      int t = this.getTime();
      int m = t / 10 / 60;
      double s = (t % 60);
      String output = String.format("%s \t %s mins %s secs \t %s", this.getName(), m, s, this.getRaceCat());
      // System.out.println(output);
      return output;
   }

   @Override
   public int compareTo(Cyclist aCyclist) {
      return (this.getTime() - aCyclist.getTime());
   }
}
