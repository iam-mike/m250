
/**
 * Small utility used for a car dealer to manage stock levels
 * 
 * @author Mike witts
 * @version 20210410
 */
import java.util.*;

public class Dealership {
   private SortedMap<String, List<String>> cars;

   /**
    * Constructor for objects of class Dealership
    */
   public Dealership() {
      cars = new TreeMap<>();
   }

   /**
    * Adds default stock list to dealership
    */
   public void restock() {
      List<String> bmwModels = new ArrayList<String>();
      bmwModels.add("1 Series");
      bmwModels.add("2 Series");
      bmwModels.add("3 Series");
      bmwModels.add("4 Series");
      bmwModels.add("M4");
      cars.put("BMW", bmwModels);
      List<String> vauxhallModels = new ArrayList<String>();
      vauxhallModels.add("Corsa");
      vauxhallModels.add("Viva");
      vauxhallModels.add("Astra");
      vauxhallModels.add("Insignia");
      cars.put("Vauxhall", vauxhallModels);
      List<String> fordModels = new ArrayList<String>();
      fordModels.add("KA");
      fordModels.add("Fiesta");
      fordModels.add("Focus");
      fordModels.add("Mondea");
      fordModels.add("Kuga");
      cars.put("Ford", fordModels);
   }

   /**
    * Prints current stock level of dealership
    */
   public void printMap() {
      Set<String> manufacturers = cars.keySet();

      for (String manufacturer : cars.keySet()) {
         System.out.println(String.format("The following %s models are in stock: ", manufacturer));
         System.out.println(cars.get(manufacturer));

      }
   }

   /**
    * prints all stock for current manufacturer, if present.
    */
   public void printMapValue(String aKey) {
      if (cars.containsKey(aKey)) {
         System.out.println(cars.get(aKey));
      } else {
         System.out.println("No cars by this manufacturer in stock!");
      }
   }

   /**
    * adds new entry to stock list, overwrites existing if necessary
    */
   public void addMapEntry(String manufacturer, List<String> models) {
      cars.put(manufacturer, models);
   }

   /**
    * deletes key and associated values from Map if present and returns true. Else,
    * returns false.
    */
   public boolean deleteEntry(String aKey) {
      boolean result = false;
      if (cars.containsKey(aKey)) {
         cars.remove(aKey);
         result = true;
      } else {
         result = false;
      }
      return result;
   }

   /**
    * adds model to existing manufacturer
    */
   public void addToValueAtKey(String aKey, String aValue) {
      if (cars.containsKey(aKey)) {
         cars.get(aKey).add(aValue);
      }
   }

   /**
    * removes model from existing manufacturer
    */
   public void deleteFromValueAtKey(String aKey, String aValue) {
      if (cars.containsKey(aKey)) {
         List<String> newValues = new ArrayList<String>();
         newValues = cars.get(aKey);
         newValues.remove(aValue);
         cars.remove(aKey);
         cars.put(aKey, newValues);
      }
   }
}