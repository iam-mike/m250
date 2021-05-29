
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
   // instance variables - replace the example below with your own
   private int x;

   /**
    * Constructor for objects of class main
    */
   public main()
   {
      // initialise instance variables
      int[] anArray = {1,2,3,4,5,6,7};
      System.out.println(sumArrayRange(anArray, 0, 2));
   }
public int sumArrayRange(int[] dataArray, int start, int end)
{
   int sum=0;
       for (int i=start; i < end+1; i++)
       {
         //System.out.println(dataArray[i]);
         sum += dataArray[i];
         //System.out.println(sum);
       }
       return sum;
       }
}
