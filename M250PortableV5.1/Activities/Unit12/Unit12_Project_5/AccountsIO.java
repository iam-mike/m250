import java.util.*;
import java.io.*;
import ou.*;

/**
 * AccountsIO is a utility class that uses static methods to
 * read from and write to text files the details of Account objects. 
 * 
 * @author M250 Module Team 
 * @version 1.2
 */
public class AccountsIO
{
   /**
    * Prompts the user for a pathname and then attempts to open a stream
    * on the file specified by the pathname. The method then writes
    * the details of the accounts held in the argument accountCollection
    * to the stream. The account details are preceded by an explanatory
    * heading explaining the order of the information.
    */
   public static void generateReport(Collection<Account> accountCollection)
   {
      String pathName = OUFileChooser.getFilename();
      File accountFile = new File(pathName);
      BufferedWriter bufferedFileWriter = null;

      try
      {
         bufferedFileWriter = new BufferedWriter(new FileWriter(accountFile));
         bufferedFileWriter.write("Account Details (Holder, Account Number and Balance)");
         bufferedFileWriter.newLine();
         for (Account eachAccount : accountCollection)
         {
            bufferedFileWriter.write(eachAccount.getHolder() + " "
               + eachAccount.getNumber() + " "
               + eachAccount.getBalance());
            bufferedFileWriter.newLine();
         }
      }
      catch (Exception anException)
      {
         System.out.println("Error: " + anException);
      }
      finally
      {
         try
         {
            bufferedFileWriter.close();
         }
         catch (Exception anException)
         {
            System.out.println("Error: " + anException);
         }
      }
   }

   /**
    * Prompts the user for a pathname and then attempts to open a stream
    * on the file specified by the pathname. The method then writes
    * the details of the accounts held in the argument accountCollection
    * to the stream. The account details are written in CSV format.
    */
   public static void saveAccounts(Collection<Account> accountCollection)
   {
      String pathName = OUFileChooser.getFilename();
      File accountFile = new File(pathName);
      BufferedWriter bufferedFileWriter = null;

      try
      {
         bufferedFileWriter = new BufferedWriter(new FileWriter(accountFile));
         for (Account eachAccount : accountCollection)
         {
            bufferedFileWriter.write(eachAccount.getHolder() + ","
               + eachAccount.getNumber() + ","
               + eachAccount.getBalance());
            bufferedFileWriter.newLine();
         }
      }
      catch (Exception anException)
      {
         System.out.println("Error: " + anException);
      }
      finally
      {
         try
         {
            bufferedFileWriter.close();
         }
         catch (Exception anException)
         {
            System.out.println("Error: " + anException);
         }
      }
   }

   /**
    * Prompts the user for a pathname and then attempts to open a stream
    * on the specified file. The method expects a file containing the details
    * of accounts in CSV format and will return a collection of Account objects
    * constructed from those details
    */
   public static Collection<Account> loadAccounts()
   {
      String pathname = OUFileChooser.getFilename();
      File aFile = new File(pathname);
      BufferedReader bufferedFileReader = null;

      // 1. Declare a variable, accountSet, of type Set<Account>, and assign to it an instance of HashSet

      try
      {
         // 2. Declare the variables accountHolder, accountNumber and accountBalance

         // 3. Declare the variable lineScanner of type Scanner

         bufferedFileReader = new BufferedReader(new FileReader(aFile));

         String currentLine = bufferedFileReader.readLine();
         while (currentLine != null)
         {

            // 4. Create an instance of Scanner using currentLine as the argument to the constructor,
            //    assigning the new instance of Scanner to the variable lineScanner

            // 5. Set lineScanner to look for comma token delimiters.

            // 6. Using lineScanner parse the current source string so that extracted tokens
            //    are assigned to the three variables, accountHolder, accountNumber and accountBalance.

            // 7. Create and initialise an Account object and add it to the set accountSet.

            currentLine = bufferedFileReader.readLine(); //make sure this is the last line in the while loop
         }
      }
      catch (Exception anException)
      {
         System.out.println("Error: " + anException);
      }
      finally
      {
         try
         {
            bufferedFileReader.close();
         }
         catch (Exception anException)
         {
            System.out.println("Error: " + anException);
         }
      }
      // 8. return the set referenced by accountSet
   }
}
