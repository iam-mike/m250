import java.util.*;
import ou.*;

/**
 * A class which simulates a simple dating agency.
 * 
 * @author M250 Module Team
 * @version 1.0
 */

public class DatingAgency
{
   /**
    * Creates a set referenced by the variable interestsSet and then
    * repeatedly displays a dialog box (until cancel is pressed) in 
    * order to gather a client's interests and add them to interestsSet. 
    * Finally the method returns interestsSet.
    */
   public Set<String> gatherInterests(String client) 
   {
      Set<String> interestsSet = new HashSet<>();
      String dialogString = "Please input an interest for  "
         + client + ". Press Cancel to end."; 
      String input = OUDialog.request(dialogString);
      while (input != null)
      {
         interestsSet.add(input);
         input = OUDialog.request(dialogString);
      }

      return interestsSet;
   }

}