/**
 * CurrentAccount class used to model simple current accounts, allowing money 
 * to be credited to, and debited and transfered from, an account, subject to 
 * a given credit limit. 
 *
 * @author M250 Module Team
 * @version 1.5
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

   /** 
    * Calculate and return the amount available to spend 
    * (the total of the balance and the creditLimit).
    */
   public double availableToSpend()
   {
      return (this.getBalance() + this.getCreditLimit());
   }

   /**
    * If the amount available to spend (the balance and the creditLimit)
    * is greater than or equal to the argument anAmount, the balance of 
    * the receiver is debited by anAmount and the method returns true.
    * If the amount available to spend is less than the argument anAmount, 
    * the method simply returns false.
    */
   @Override
   public boolean debit(double anAmount)
   {
      if (anAmount <= this.availableToSpend())
      {
         this.setBalance(this.getBalance() - anAmount);
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
    * Return true if the pinNum of the receiver matches 
    * the argument aPin, false otherwise.
    */
   public boolean checkPin(String aPin)
   {
      return this.getPinNum().equals(aPin);
   }
}
