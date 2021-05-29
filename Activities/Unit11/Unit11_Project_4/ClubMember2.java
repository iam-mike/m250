/**
 * Instances ofClubMember2 simulate members of a club 
 * and have the attributes firstName, lastName and age. 
 * 
 * When clubMember2s are compared, the last name is used as a 
 * primary key and the first name as a secondary key.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */
public class ClubMember2 implements Comparable<ClubMember2>
{
   private int age;
   private String firstName;
   private String lastName;

   /**
    * Constructor for ClubMember2 objects.
    */
   public ClubMember2(String first, String last, int years)
   {
      this.firstName = first;
      this.lastName = last;
      this.age = years;
   }

   /**
    * Sets the receiver's age to the argument.
    */
   public void setAge(int memberAge)
   {
      this.age = memberAge;
   }

   /**
    * Returns the receiver's age.
    */
   public int getAge()
   {
      return this.age;
   }

   /**
    * Sets the receiver's firstName to the argument.
    */
   public void setFirstName(String memberFirstName)
   {
      this.firstName = memberFirstName;
   }

   /**
    * Returns the receiver's firstName.
    */
   public String getFirstName()
   {
      return this.firstName;
   }

   /**
    * Sets the receiver's lastName to the argument.
    */
   public void setLastName(String memberLastName)
   {
      this.lastName = memberLastName;
   }

   /**
    * Returns the receiver's lastName.
    */
   public String getLastName()
   {
      return this.lastName;
   }

   /**
    * Compares the receiver with the argument and returns:
    * The primary sort is on the last name
    * and the secondary sort is on the first name, both using String comparisons. 
    */
   public int compareTo(ClubMember2 anotherMember)
   {
      int primary = this.getLastName().compareTo(anotherMember.getLastName());
      int secondary = this.getFirstName().compareTo(anotherMember.getFirstName());
      if (primary == 0)
      {
         return secondary;
      }
      else
      {
         return primary;
      }
   }
}
