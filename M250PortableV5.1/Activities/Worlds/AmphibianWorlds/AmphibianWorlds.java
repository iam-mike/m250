import amphibianworlddetails.*;

/**
 * The AmphibianWorlds class provides access to the M250 Amphibian MicroWorlds.
 *
 * @author M250 Module Team
 * @version 1.0
 */
public class AmphibianWorlds extends SimpleAmphibianWorld
{
   /**
    * Constructor for objects of AmphibianWorlds.
    */
   public AmphibianWorlds()
   {
      super();
   }
   
   public AmphibianWorlds(boolean bj)
   {
      super(bj);
   }
   
   /**
    * The main method used to open the AmphibianWorlds from the command line.
    */
   public static void main (String[] args)
   {
      AmphibianWorlds aw = new AmphibianWorlds();
   }
}
