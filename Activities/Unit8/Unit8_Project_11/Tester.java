import ou.*;
/**
 * A class to test when it would be useful to catch unchecked exceptions.
 * 
 * @M250 module team 
 * @version 1.0
 */
public class Tester
{

   /**
    * Constructor for objects of class Tester.
    */
   public Tester()
   {

   }

   /**
    * Testing dividing an integer by zero.
    * An example of a method - replace this comment with your own.
    */
   public void divideByZero()
   {
      String numeratorString, denominatorString;
      int numerator, denominator;

      numeratorString = OUDialog.request("enter an integer for the numerator");
      numerator = Integer.parseInt(numeratorString);
      denominatorString = OUDialog.request("enter an integer for the denominator");
      denominator = Integer.parseInt(denominatorString);
      OUDialog.alert("The result of the integer division of " + numeratorString + " by " + denominatorString 
         + " is " + numerator / denominator);

   }

   /**
    * Testing throwing a NullPointerException.
    */
   public void nullPointer()
   {
      String s = null;

      for (int i = 0; i < 4; i++)
      {
         s = OUDialog.request("Enter a string to determine its length");

         OUDialog.alert("The length of string " + s + " is " + s.length());
      }

   }
}
