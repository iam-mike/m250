import ou.*;
/**
 * LevelCrossingController for TMA03Q1.
 * 
 * @author M250 Module Team
 * @version 1.0
 */
public class LevelCrossingController
{  
   private Light topLeft;
   private Light topRight;
   private Light bottom;
   
   private boolean trainComing;
  
   private int state; // 0 == black, black, black, false | 1 == orange, black, black, true | 2 == black, red, black, true | 3 == black, black, red, true
   public final static int MIN_REPEATS =0;
  /**
   * does stuff
   * TODO - ADD Comment
   */
  public LevelCrossingController(Light tl, Light tr, Light bt)
  {
     topLeft = tl;
     topRight = tr;
     bottom = bt;
     setPositions();
     state=0;
     setTrainComing(false);
     colourAllLights();
  }

    /**
     * @return trainComing
     */
    public boolean getTrainComing()
    {
        return trainComing;
    }

    /**
     * @param trainComing
     * setter for trainComing
     */
    public void setTrainComing(boolean trainComing)
    {
       trainComing = trainComing;
    }
      
   /**
    * Sets the positions of the lights.
    */
   private void setPositions() 
   {
      this.bottom.setXPos(100);
      this.bottom.setYPos(200);      
      this.topLeft.setXPos(0);
      this.topLeft.setYPos(100);      
      this.topRight.setXPos(200);
      this.topRight.setYPos(100);
   }   
   
   /**
    * cycles through state 0-3 in prescribed order
    * 0 = 1
    * 1 = 2
    * 2 = 3
    * 3 = 2
    */
   public void changeState()
   {
      switch(state)
      {
         case 0:case 1:case 2:
            state++;
            break;
         case 3:
            state--;
            break;
         default:
            state=0;
            break;
      } 
   }
   
   /**
       * 
       */
   public void colourAllLights()
   {
      switch(state)
      {
         case 0:
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.BLACK);
            break;
         case 1:
            colourLight(bottom, OUColour.ORANGE);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.BLACK);
            break;
         case 2:
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.RED);
            colourLight(topRight, OUColour.BLACK);
            break;
         case 3:
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.RED);
            break;
         default:
            colourLight(bottom, OUColour.BLACK);
            colourLight(topLeft, OUColour.BLACK);
            colourLight(topRight, OUColour.BLACK);
            break;
      }
   }
  
   /**
    * Find out how many times red lights should flash at the crossing.
    * Simulates length of train at crossing.
    */   
    public static int findNumRepeats()
    {
       int repeats = 0;
        String timesAsString =              
          OUDialog.request("How many times should the red lights"
          + " flash? ("
          + LevelCrossingController.MIN_REPEATS
          + " or over times)");
                 
        if (timesAsString != null)
        {
           try
           {
              repeats = Integer.parseInt(timesAsString);
              if(repeats < MIN_REPEATS)
              {
                 OUDialog.alert("Value too low. please enter value higher than" +MIN_REPEATS); //scenario 2
               }
           }
           catch(NumberFormatException ex)
           {
              OUDialog.alert("Incorrect format entered. please use integer digits only"); //scenario 1
           }

        }
       return repeats;
    }
    
   /**
    * Causes execution to pause for a number of milliseconds.
    */
    public static void delay(int time)
    {
       try
       {
          Thread.sleep(time); 
       }
       catch (Exception e)
       {
          System.out.println(e);
       } 
    }
    
   public void colourLight(Light light, OUColour colour)
   {
      if (colour.equals(OUColour.RED) || colour.equals(OUColour.GREEN)
      || colour.equals(OUColour.ORANGE) || colour.equals(OUColour.BLACK))
      {
         light.setColour(colour);
      }
   }
   
   public void doTrainApproaching()
   {
      System.out.println("Train approaching");
      setTrainComing(true);
      changeState();
      colourAllLights();
      System.out.println("Barrier lowered");
      delay(1000);
      int numRepeats = findNumRepeats();
      for(int i=0; i <numRepeats; i++)
      {
         changeState();
         delay(500);
         colourAllLights();
      }
      delay(1000);
      setTrainComing(false);
      state=0;
      colourAllLights();
      System.out.println("Barrier raised");
   }
}


