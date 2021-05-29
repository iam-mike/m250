/**
 * AlternativeAccount is an account class that will protect itself from
 * possible problems with debits using design by contract.
 * 
 * @author M250 Module Team 
 * @version 1.0
 */
public class AlternativeAccount extends Account
{
   // instance variables - replace the example below with your own

   /**
    * Debits the balance by anAmount.
    * @param anAmount which must be less than or equal to the balance and positive.
    * @throws IllegalArgumentException if balance is less than anAmount or anAmount is not positive.
    */
   public void debit2(double anAmount)
   {     
      if ((this.getBalance() < anAmount) || (anAmount <= 0.0))
      {
         throw new IllegalArgumentException("debit " 
            + anAmount + " is inappropriate. Balance " 
            + this.getBalance());
      }

      this.setBalance(this.getBalance() - anAmount);
   }
}
