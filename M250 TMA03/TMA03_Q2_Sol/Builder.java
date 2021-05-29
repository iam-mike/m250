import java.util.*;

/**
 * The class Builder is used to hold data about the builder's 
 * on site  contractors, and their contact details and trade. 
 * 
 * @author 
 * @version  
 */
 public class Builder
 {
    private Map<String, Contractor> contractors;
   /**
     * Constructor for objects of class Builder
     */
     public Builder()
     {
        super();
        contractors = new HashMap<>();
     }
     
     public void addContractor(String aReg, String aName, String anAddress, String aTrade)
     {
       Contractor aContractor = new Contractor(aName, anAddress, aTrade);
       contractors.put(aReg, aContractor);
     }
     
     public void printContractors()
     {
        for (String eachContractor : contractors.keySet())
        {
           Contractor output = contractors.get(eachContractor);
           System.out.println(output);
         }
     }
     
     public void findContractor(String aReg)
     {
        Contractor output = contractors.get(aReg);
        if(output != null )
        {
           System.out.println(output);
        } else 
        {
           String message = String.format("No contractor found with reg: %s", aReg);
           System.out.println(message);
        }
     }
     
     public Set<Contractor> findContractorsForTrade(String aTrade)
     {
        Set<Contractor> result = new HashSet<>();
        for (String eachContractor : contractors.keySet())
        {
           Contractor c = contractors.get(eachContractor);
           String cTrade = c.getTrade();
           if (cTrade == aTrade)
           {
              result.add(c);
           }
         
         }
         return result;
     }
   
}
