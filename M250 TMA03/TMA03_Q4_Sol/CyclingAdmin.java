
/**
 * Class CyclingAdmin - carries out administrative tasks for a cycling race.
 * 
 * @author 
 * @version
 */

import java.util.*;
import java.io.*;
import ou.*;

public class CyclingAdmin {

   /* instance variables */
   private Set<Cyclist> cyclists;
   /* static variables */
   public static final int MIN_RACE_TIME = 6000; // the minimum time to
   // complete the race in tenths of a second (i.e. 10 mins)

   /**
    * Constructor for objects of class CyclingAdmin
    */
   public CyclingAdmin() {
      super();
      this.cyclists = new HashSet<>();
   }

   /* instance methods */
   public void readInCyclists() {
      String filePath = OUFileChooser.getFilename();
      File cRacers = new File(filePath);
      BufferedReader bufferedReader = null;
      try {
         cyclists.clear();
         String name;
         int age;
         String raceCat;
         Scanner cScanner;
         bufferedReader = new BufferedReader(new FileReader(cRacers));
         String currentLine = bufferedReader.readLine();
         while (currentLine != null) {
            cScanner = new Scanner(currentLine);
            cScanner.useDelimiter(",");
            name = cScanner.next();
            age = cScanner.nextInt();
            // System.out.println(name);
            // System.out.println(age);
            if (age < 18) {
               raceCat = "Junior";
            } else if (age >= 40) {
               raceCat = "Veteran";
            } else {
               raceCat = "Adult";
            }
            cyclists.add(new Cyclist(name, raceCat));
            currentLine = bufferedReader.readLine();
         }
      } catch (IOException e) {
         System.out.println("Error: " + e);
      } finally {
         try {
            bufferedReader.close();
         } catch (Exception e) {
            System.out.println("Error: " + e);
         }
      }

   }

   public void rideRace() {
      Random generator = new Random();
      for (Cyclist cyclist : cyclists) {
         int time = generator.nextInt(MIN_RACE_TIME) + MIN_RACE_TIME;
         cyclist.setTime(time);
      }
   }

   /**
    * Clears the cyclists list.
    */
   public void clear() {
      this.cyclists.clear();
   }

   public void displayResults() {
      Set<Cyclist> results = new TreeSet<>();
      for (Cyclist cyclist : cyclists) {
         results.add(cyclist);
      }
      System.out.println(results.toString());
   }
}
