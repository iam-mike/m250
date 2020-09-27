//Sample code for the DatingAgency class is given below

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
      // Replace these comments with the code to create a
      // new empty instance of HashSet<String> and assign it to
      // to variable called interestsSet declared as type Set<String>

      String dialogString = "Please input an interest for client "
         + client + ". Press Cancel to end."; 
      String input = OUDialog.request(dialogString);
      while (input != null)
      {
         // Replace these comments with the code to add
         // input to the set interestsSet
         input = OUDialog.request(dialogString);
      }

      return interestsSet;
   }

}

//Sample code to test the DatingAgency class is given below
//Activity 13

DatingAgency da = new DatingAgency();
da.gatherInterests("Bob");
da.gatherInterests("Sue");
