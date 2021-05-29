// First create a CurrencyConverter object:

CurrencyConverter dollarConverter = new CurrencyConverter("US dollars", 1.7);

// Now try some currency transactions:
dollarConverter.reportCostOfCurrency(300);
dollarConverter.reportCostOfCurrency(250);

// The next statement will cause a problem. Can you think why?
dollarConverter.reportCostOfCurrency(2.6);

// Change the value of the object’s exchangeRate instance variable:

dollarConverter.setExchangeRate(2.0);

//  Change the value of the class variable percentageRate:

CurrencyConverter.setPercentageRate(0.07);

// Now try two more currency conversions:

dollarConverter.reportCostOfCurrency(300);
dollarConverter.reportCostOfCurrency(250);
