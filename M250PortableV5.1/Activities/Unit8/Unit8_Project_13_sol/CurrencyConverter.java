import ou.*;

/**
 * Instances of this class are used to calculate the cost in pounds sterling
 * of buying a foreign currency.
 * 
 * @author M250 Module Team 
 * @version 1.9
 */

public class CurrencyConverter
{
   // class variables
   private static double fixedFee = 2.00;
   private static double percentageRate = 0.05;

   // instance variables
   private double exchangeRate;
   private String currencyName;

   /**
    * Constructor for objects of class CurrencyConverter.
    * @param nameOfCurrency which should not be null or ""
    * @param rate which must be positive
    * @throws IllegalArgumentException if currency name is null or ""
    * or rate is not positive
    */
   public CurrencyConverter(String nameOfCurrency, double rate)
   {
      if (nameOfCurrency == null || nameOfCurrency.equals(""))
      {
         throw new 
         IllegalArgumentException("Currency name " + nameOfCurrency + " is not valid");
      }

      if (rate <= 0)
      {
         throw new 
         IllegalArgumentException("exchange rate should be positive; received value was " 
            + rate);
      }
      this.currencyName = nameOfCurrency;
      this.exchangeRate = rate;
   }

   // class methods
   /**
    * Sets the fixedFee of the receiver to the value of the argument.
    * @param fee
    */
   public static void setFixedFee(double fee)
   {
      CurrencyConverter.fixedFee = fee;
   }

   /**
    * Returns the value of the fixedFee of the receiver.
    * @return fixedFee
    */
   public static double getFixedFee()
   {
      return CurrencyConverter.fixedFee;
   }

   /**
    * Sets the percentageRate of the receiver to the value of the argument.
    * @param percentage
    */
   public static void setPercentageRate(double percentage)
   {
      CurrencyConverter.percentageRate = percentage;
   }

   /**
    * Returns the value of the percentageRate of the receiver.
    * @return percentageRate
    */
   public static double getPercentageRate()
   {
      return CurrencyConverter.percentageRate;
   }

   //instance methods
   /**
    * Sets the exchangeRate of the receiver to the value of the argument.
    * @param rate which must be positive
    * @throws IllegalArgumentException if rate is not positive
    */
   public void setExchangeRate(double rate)
   {
      if (rate <= 0)
      {
         throw new 
         IllegalArgumentException("exchange rate should be positive; received value was " 
            + rate);
      }
      this.exchangeRate = rate;
   }

   /**
    * Returns the value of the exchangeRate of the receiver.
    * @return exchangeRate
    */
   public double getExchangeRate()
   {
      return this.exchangeRate;
   }

   /**
    * Sets the curencyName of the receiver to the value of the argument.
    * @param nameOfCurrency which must not be null or ""
    * @throws IllegalArgumentException if currency name is null or ""
    */
   public void setCurrencyName(String nameOfCurrency)
   {
      if (nameOfCurrency == null || nameOfCurrency.equals(""))
      {
         throw new IllegalArgumentException("Currency name " + nameOfCurrency + " is not valid");
      }
      this.currencyName = nameOfCurrency;
   }

   /**
    * Returns the value of the currencyName of the receiver.
    * @return currencyName
    */
   public String getCurrencyName()
   {
      return this.currencyName;
   }

   /** 
    * Calculate and report cost in sterling of buying an amountOfCurrency. 
    * @param amountOfCurrency
    */
   public void reportCostOfCurrency(int amountOfCurrency)
   {
      double commission, cost;

      commission = this.calculateCommission(amountOfCurrency);
      cost = commission + (amountOfCurrency / this.getExchangeRate());
      OUDialog.alert(amountOfCurrency + " " 
         + this.getCurrencyName() 
         + " cost ?" 
         + String.format("%.2f", cost));     
   }

   /**
    * Prompts the user to enter the amount of currency via a request() dialogue box.
    * Once the cost of the currency in sterling has been calculated the method asks 
    * the user via a confirm() dialogue box if they wish to calculate the cost of 
    * another transaction. The method will continue to ask the user if they wish to 
    * calculate the cost of another transaction until the user clicks the No button 
    * of the confirm() dialogue box. 
    * @throws NumberFormatException if the entered string does not represent an integer
    */
   public void doTransactions()
   {
      String amountString;
      int amountOfCurrency;
      boolean repeat = true;

      while (repeat)
      {
         amountString = OUDialog.request("How many " + this.getCurrencyName() + "?");
         try
         {
            amountOfCurrency = Integer.parseInt(amountString);
            this.reportCostOfCurrency(amountOfCurrency);  
         }  
         catch (NumberFormatException anException)
         {
            OUDialog.alert(anException.toString());
         }
         repeat = OUDialog.confirm("Would you like another transaction?");
      }
   }

   /**
    * Calculates the commission on amountOfCurrency.
    * @param amountOfCurrency which must be greater than 0
    * @return commission
    */
   private double calculateCommission(int amountOfCurrency)
   {
      assert amountOfCurrency > 0 : "amount of currency must be positive";

      double percentageFee;

      percentageFee = CurrencyConverter.getPercentageRate() 
      * amountOfCurrency / this.getExchangeRate();

      return CurrencyConverter.getFixedFee() + percentageFee;
   }

   /**
    * Displays the commission on amountOfCurrency.
    * @param amountOfCurrency
    */
   public void displayCommission(int amountOfCurrency)
   {
      OUDialog.alert("To buy " + amountOfCurrency + " " + this.getCurrencyName()
         + " will entail a commission cost of ?" 
         + String.format("%.2f", this.calculateCommission(amountOfCurrency)));
   }

}