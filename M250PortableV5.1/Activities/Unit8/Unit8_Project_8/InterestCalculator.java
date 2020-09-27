import ou.*;

/** 
 * A class with one static method which is used to calculate
 * compound interest on an initial investment for a fixed number 
 * of years. With added bugs!
 * 
 * @author M250 Module Team
 * @version 1.0
 */

public class InterestCalculator 
{
   /* Get the interest rate from user */
   public static void calculateInterest()
   {
      double nestEgg; //the amount to be invested
      int years; //the number of years the amount is to be invested  
      double interest; // the interest gained in a particular year

      nestEgg = Integer.parseInt(OUDialog.request ("Enter sum to invest ")); 
      rate = Double.parseDouble(OUDialog.request ("Enter interest rate"));    
      years = Integer.parseInt(OUDialog.request ("Enter number of years")); 

      //Loop years number of times, accumulating interest */
      for (int year = 1; year < years; year = year + 1) 
      {
         interest = nestEgg * rate / 100.0
         nestEgg = nestEgg + interest;
      }

      OUDialog.alert("After " + years + " years your nest egg would be worth £  + String.format("%.2f",nestEgg));
   }   
}
