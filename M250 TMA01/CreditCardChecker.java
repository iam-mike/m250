/**
 * Write a description of class CreditCardChecker here.
 *
 * @author (Michael Witts)
 * @version (20201127)
 * @description (Answer to TMA01 Question 1)
 */
import java.io.*; 
public class CreditCardChecker
{
    // instance variables - replace the example below with your own
    private String longNumber;

    /**
     * Constructor for objects of class CreditCardChecker
     */
    public CreditCardChecker(String input)
    {
        // initialise instance variables
        longNumber = input;
    }
    
  // Getter method for longNumber
    public String getLongNumber() {
    return longNumber;
  }
  
  // check length of string
  public boolean isCorrectLength() {
   if (longNumber.length() < 17) {
    return true;
   } else { return false;}
    }

 // get first fifteen charactiers
 public String firstFifteen(){
    String result = longNumber.substring(0,15);
    return result;
 }
 
 public int calculateCheckNumber(){
   String s = getLongNumber();
   s = firstFifteen();

   // initialise for algorithm.
   int sum = 0;
   boolean isEven = true;
   for(int i = s.length()-1; i >= 0; i--)
   {
      int n = Integer.parseInt(s.substring(i,i+1));      
      if(isEven)
      { 
         n *= 2;
         if (n > 9)
         {
            n -= 9;
         }
      }
      System.out.println(n);
      sum += n;
      isEven = !isEven;
   }
   System.out.println("sum is: "+sum);
   int c = (sum/10)*10+10-sum;
   return c;
 }
 
 public void validNumberResult()
 {
    int num = Integer.parseInt(longNumber.substring(longNumber.length()-1));
    System.out.println(num);
    int check = calculateCheckNumber();
    System.out.println(check);
    if(!isCorrectLength() || num != check){
        System.out.println("Isn't valid");
      } else {
         System.out.println("could be valid");
      }
 }
}       