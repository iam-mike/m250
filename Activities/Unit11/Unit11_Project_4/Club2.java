import java.util.*;

/**
 * Club2 has a method to create a sorted collection of instances
 * of ClubMember2 (which sort by last name, then first name) and print
 * out the contents.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */
public class Club2
{
   /**
    * show members in sorted order, according to ClubMember2 sorting.
    */
   public void showMembers()
   {
      List<ClubMember2> club2 = new ArrayList<>();

      ClubMember2 m1 = new ClubMember2("Aemilia", "Rubra", 27);
      ClubMember2 m2 = new ClubMember2("Gaius", "Albus", 21);
      ClubMember2 m3 = new ClubMember2("Claudia", "Fusca", 35);
      ClubMember2 m4 = new ClubMember2("Decimus", "Flammeus", 30);
      ClubMember2 m5 = new ClubMember2("Felicia", "Prasina", 61);
      ClubMember2 m6 = new ClubMember2("Brutus", "Albus", 48);

      club2.add(m1);
      club2.add(m2);
      club2.add(m3);
      club2.add(m4);
      club2.add(m5);
      club2.add(m6);

      Collections.sort(club2);

      for (ClubMember2 eachMember : club2)
      {
         System.out.println("Club member: " + eachMember.getFirstName()
            + " " + eachMember.getLastName() + ", age " + eachMember.getAge());
      }

   }
}
