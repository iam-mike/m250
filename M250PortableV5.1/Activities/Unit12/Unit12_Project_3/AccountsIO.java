import java.util.*;
import java.io.*;
import ou.*;

/**
 * AccountsIO is a utility class that uses static methods to
 * read from and write to text files the details of Account objects. 
 * 
 * @author M250 Module Team 
 * @version 1.0
 */
public class AccountsIO
{
   /**
    * Prompts the user for a pathname and then attempts to open a stream
    * using the file specified by the pathname. The method then writes
    * the details of the accounts held in the argument accountCollection 
    * to the stream. The account details are preceded by a
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
}