
/**
 * Instances of ClubMember simulate members of a club 
 * and have the attributes firstName, lastName and age.
 * 
 * @author M250 Module Team
 * @version 1.2 (4 April 2012)
 */

public class ClubMember implements Comparable<ClubMember>
{ 
   private int age;
   private String firstName;
   private String lastName;

   /**
    * Constructor for ClubMember objects.
    */

   public ClubMember(String first, String last, int years)
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
    * Compares the receiver with the argument and returns
    * the compareTo result of the last names, using String compareTo.
    */
   public int compareTo(ClubMember anotherMember)
   {
      return this.getLastName().compareTo(anotherMember.getLastName());
   }

}
