import java.util.*;
import ou.*;

/**
 * A class which simulates a simple dating agency using a map.
 * 
 * @author M250 Module Team
 * @version 1.1
 */

public class DatingAgency2
{
   /**
    * Stores and retrieves data about client names and interests. 
    */
   public void datingDemo() 
   {
      Map<String, Set<String>> clientMap = new HashMap<>();
      Set<String> interests = new HashSet<>();

      interests.add("Food");
      interests.add("Wine");
      interests.add("Tandems");
      clientMap.put("Hal", interests);

      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Walking");
      interests.add("Welding");
      clientMap.put("Gemma", interests);

      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Cinema");
      interests.add("Wine");
      clientMap.put("Caroline", interests);

      interests = clientMap.get("Xander");
      System.out.println("Xanders interests are " + interests);

      if ((clientMap.remove("Xander")) == null)
      {
         OUDialog.alert("Xander not found ");
      }

      for (String eachClient : clientMap.keySet()) 
      { 
         interests = clientMap.get(eachClient);
         System.out.println(eachClient + " is interested in: " + interests);
      }
   }

   /**
    * Finds and outputs matching interests. 
    */
   public void matchesDemo() 
   {
      Map<String, Set<String>> clientMap = new HashMap<>();
      Set<String> interests = new HashSet<>();

      interests.add("Food");
      interests.add("Wine");
      interests.add("Tandems");
      clientMap.put("Hal", interests);
	  
      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Walking");
      interests.add("Welding");
      clientMap.put("Gemma", interests);
	  
      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Cinema");
      interests.add("Wine");
      clientMap.put("Caroline", interests);

      Set<String> halsInterests  = clientMap.get("Hal");
      String outputString;
      Set<String> eachClientInterests;
      Set<String> intersection;

      for (String eachClient : clientMap.keySet()) 
      {
         eachClientInterests = clientMap.get(eachClient);
         intersection = new HashSet<>(halsInterests);
         intersection.retainAll(eachClientInterests);
         outputString = "Hal and " + eachClient 
         + " have common interests: "
         + intersection;
         System.out.println(outputString) ;
      }
   }   

   /**
    * Finds and outputs matching interests. 
    */
   public  void sensibleMatches1() 
   {  
      Map<String, Set<String>> clientMap = new HashMap<>();
      Set<String> interests = new HashSet<>();

      interests.add("Food");
      interests.add("Wine");
      interests.add("Tandems");
      clientMap.put("Hal", interests);
	  
      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Walking");
      interests.add("Welding");
      clientMap.put("Gemma", interests);
	  
      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Cinema");
      interests.add("Wine");
      clientMap.put("Caroline", interests);

      Set<String> halsInterests = clientMap.get("Hal");
      String outputString;
      Set<String> eachClientInterests;
      Set<String> intersection ;

      Map<String, Set<String>> mapWithoutHal = new HashMap<>(clientMap);
      mapWithoutHal.remove("Hal");
      for (String eachClient : mapWithoutHal.keySet()) 
      {
         eachClientInterests = clientMap.get(eachClient);
         intersection = new HashSet<>(halsInterests);
         intersection.retainAll(eachClientInterests);
         outputString = "Hal and " + eachClient 
                        + " have common interests: "
                        + intersection;
         System.out.println(outputString);
      }
   }  

   /**
    * Finds and outputs matching interests. 
    */
   public void sensibleMatches2() 
   { 
      Map<String, Set<String>> clientMap = new HashMap<>();
      Set<String> interests = new HashSet<>();

      interests.add("Food");
      interests.add("Wine");
      interests.add("Tandems");
      clientMap.put("Hal", interests);
	  
      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Walking");
      interests.add("Welding");
      clientMap.put("Gemma", interests);

      interests = new HashSet<>();
      interests.add("Food");
      interests.add("Cinema");
      interests.add("Wine");
      clientMap.put("Caroline", interests);

      Set<String> halsInterests  = clientMap.get("Hal");
      String outputString;
      Set<String> eachClientInterests;
      Set<String> intersection ;

      for (String eachClient : clientMap.keySet()) 
      {
         if (!eachClient.equals("Hal"))  
         {
            eachClientInterests = clientMap.get(eachClient);
            intersection = new HashSet<>(halsInterests);
            intersection.retainAll(eachClientInterests);
            outputString = "Hal and " + eachClient 
                            + " have common interests: "
                            + intersection;
            System.out.println(outputString);
         }
      }
   }    
}