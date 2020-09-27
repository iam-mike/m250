/**
 * CurrentAccount class used to model simple current accounts, allowing money 
 * to be credited to, and debited and transfered from, an account, subject to 
 * a given credit limit. 
 *
 * @author M250 Module Team
 * @version 1.3
 */

public class CurrentAccount extends Account
{
   /* instance variables */

   private double creditLimit;
   private String pinNum;

   /**
    * Constructor for objects of class CurrentAccount.
    */    
   public CurrentAccount()
   {
      super();
      this.creditLimit = 0.0;
      this.pinNum = "0000";
   }

   /**
    * Constructor for objects of class CurrentAccount, which 
    * sets the values of holder, number, balance, creditLimit 
    * and pinNum to the arguments aHolder, aNumber, 
    * aBalance, aLimit and aPin respectively.
    */
   public CurrentAccount(String aHolder, String aNumber, 
   double aBalance, double aLimit, String aPin)
   {
      super(aHolder, aNumber, aBalance);
      this.creditLimit = aLimit;
      this.pinNum = aPin;
   } 

   /* instance methods */

   /**
    * Returns the creditLimit of the receiver. 
    */   
   public double getCreditLimit()
   {
      return this.creditLimit;
   }

   /**
    * Sets the creditLimit of the receiver to the argument aLimit.
    */   
   public void setCreditLimit(double aLimit)
   {
      this.creditLimit = aLimit;
   }

   /**
    *  Returns the pinNum of the receiver.
    */
   public String getPinNum()    
   {
      return this.pinNum;
   }

   /**
    *  Sets the pinNum of the receiver to the argument aPin.
    */
   public void setPinNum(String aPin)
   {
      this.pinNum = aPin;
   }
}