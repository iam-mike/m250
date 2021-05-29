
import java.util.*;
/**
 * Club has a method to create a sorted collection
 * of clubMembers and to print out the contents.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012) 
 */
public class Club
{
   /**
    * show members of an example club
    */
   public void showMembers()
   {
      List<ClubMember> club = new ArrayList<>();

      ClubMember m1 = new ClubMember("Aemilia", "Rubra", 27);
      ClubMember m2 = new ClubMember("Gaius", "Albus", 21);
      ClubMember m3 = new ClubMember("Claudia", "Fusca", 35);
      ClubMember m4 = new ClubMember("Decimus", "Flammeus", 30);
      ClubMember m5 = new ClubMember("Felicia", "Prasina", 61);
      ClubMember m6 = new ClubMember("Brutus", "Albus", 48);

      club.add(m1);
      club.add(m2);
      club.add(m3);
      club.add(m4);
      club.add(m5);
      club.add(m6);

      Collections.sort(club); //  ClubMember must implement Comparable.

      for (ClubMember eachMember : club)
      {
         System.out.println("Club member: " + eachMember.getFirstName()
            + " " + eachMember.getLastName() + ", age " + eachMember.getAge());
      }

   }
}
