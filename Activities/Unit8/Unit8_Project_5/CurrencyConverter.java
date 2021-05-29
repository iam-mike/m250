import ou.*;

/**
 * Instances of this class are used to calculate the cost in pounds sterling
 * of buying a foreign currency.
 * 
 * @author M250 Module Team
 * @version 1.4
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
    */
   public CurrencyConverter(String nameOfCurrency, double rate)
   {
      this.currencyName = nameOfCurrency;
      this.exchangeRate = rate;
   }

   // class methods
   /**
    * Sets the fixedFee of the receiver to the value of the argument.
    */
   public static void setFixedFee(double fee)
   {
      CurrencyConverter.fixedFee = fee;
   }

   /**
    * Returns the value of the fixedFee of the receiver.
    */
   public static double getFixedFee()
   {
      return CurrencyConverter.fixedFee;
   }

   /**
    * Sets the percentageRate of the receiver to the value of the argument.
    */
   public static void setPercentageRate(double percentage)
   {
      CurrencyConverter.percentageRate = percentage;
   }

   /**
    * Returns the value of the percentageRate of the receiver.
    */
   public static double getPercentageRate()
   {
      return CurrencyConverter.percentageRate;
   }

   //instance methods
   /**
    * Sets the exchangeRate of the receiver to the value of the argument.
    */
   public void setExchangeRate(double rate)
   {
      this.exchangeRate = rate;
   }

   /**
    * Returns the value of the exchangeRate of the receiver.
    */
   public double getExchangeRate()
   {
      return this.exchangeRate;
   }

   /**
    * Sets the curencyName of the receiver to the value of the argument.
    */
   public void setCurrencyName(String nameOfCurrency)
   {
      this.currencyName = nameOfCurrency;
   }

   /**
    * Returns the value of the currencyName of the receiver.
    */
   public String getCurrencyName()
   {
      return this.currencyName;
   }

   /** 
    * Calculate and report cost in sterling of buying an amountOfCurrency. 
    */
   public void reportCostOfCurrency(int amountOfCurrency)
   {
      double  percentageFee, commission, cost;      

      percentageFee = CurrencyConverter.getPercentageRate() 
      * amountOfCurrency / this.getExchangeRate();

      commission = CurrencyConverter.getFixedFee() + percentageFee;

      cost = commission + (amountOfCurrency / this.getExchangeRate());      

      String costString = String.format("%.2f", cost);
      String result = amountOfCurrency + " " + this.getCurrencyName() + " cost £" + costString;

      OUDialog.alert(result);
   }
}

