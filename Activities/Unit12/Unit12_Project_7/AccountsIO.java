import java.util.*;
import java.io.*;
import ou.*;
/**
 * AccountsIO is a utility class that uses static methods to
 * read from and write to text files the details of Account objects. 
 * 
 * @author M250 Module Team 
 * @version 1.3
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
         bufferedFileWriter.write
         ("Account Details (Holder, Account Number and Balance)");
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
      Scanner bufferedScanner = null;
      Set<Account> accountSet = new HashSet<>();

      try
      {
         String accountHolder;
         String accountNumber;
         double accountBalance;
         Scanner lineScanner;
         String currentLine;
         bufferedScanner = new Scanner(new BufferedReader(new FileReader(aFile)));

         while (bufferedScanner.hasNextLine())
         {
            currentLine = bufferedScanner.nextLine();
            lineScanner = new Scanner(currentLine);
            lineScanner.useDelimiter(",");
            accountHolder = lineScanner.next(); //return the next token as a string
            accountNumber = lineScanner.next(); // return the next token as a string
            accountBalance = lineScanner.nextDouble(); // return the next token as a double
            accountSet.add(new Account(accountHolder, accountNumber, accountBalance));   
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
            bufferedScanner.close();
         }
         catch (Exception anException)
         {
            System.out.println("Error: " + anException);
         }
      }
      return accountSet;
   }
}