import ou.*;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

/**
 * Class Rocket allows a representation of a rocket to be created in the Shapes
 * Window, and for it to move up the screen.
 * 
 * This class is incomplete.
 * 
 * @author (M250 Course Team) 
 * @version (1.1)
 */
public class Rocket
{   
   private Triangle nose;      // represents the rocket's nose cone
   private Square body;        // represents the rocket's body
   private Circle jet;         // represents the blast from the rocket's engine
   
   /**
    * Constructor for objects of class Rocket
    */
   public Rocket(Triangle t, Square s, Circle c)
   {
      //first, we store references to the workspace shape objects
      this.nose = t;
      this.body = s; 
      this.jet = c;    

      //sets the initial positions of the nose.
      //The other parts need to be set relative to these positions.
      this.nose.setXPos(50);
      this.nose.setYPos(300);

      //sets the body relative to the nose, using the helper methods
      this.body.setXPos(getBodyXPos());
      this.body.setYPos(getBodyYPos());      

      //The jet is invisible to begin with, because it uses
      //the background colour of WHITE, but you can use BLACK
      //to help you see it while testing
      this.jet.setColour(OUColour.WHITE); 
      this.jet.setDiameter(10);           

      //sets the jet position relative to the body, using the helper methods
      this.jet.setXPos(getJetXPos()); 
      this.jet.setYPos(getJetYPos()); 
   }

   private int getBodyXPos()
   {
     int noseXPos;
     noseXPos = this.nose.getXPos();
     return noseXPos;
   }

   private int getBodyYPos()
   {
     int noseYPos;
     noseYPos = this.nose.getYPos()+20;
     //System.out.println(noseYPos-20);
     return noseYPos;
   }
   
   private int getJetXPos()
   {
      int bodyXPos;
      bodyXPos = this.getBodyXPos()+5;
      return bodyXPos;
   }

   private int getJetYPos()
   {
      int bodyYPos;
      bodyYPos = this.getBodyYPos()+20;
      return bodyYPos;
   }

   /**
    * Moves the nose of the receiver 
    * by anInt units.
    * Moves other rocket components relative to the 
    * position of the nose.
    */
   public void moveRocketBy(int anInt)
   {
      //to be written in Q1(b)
      int noseYPos = this.nose.getYPos();
      noseYPos = noseYPos - anInt;
      this.nose.setYPos(noseYPos);
      this.body.setYPos(getBodyYPos());  
      this.jet.setYPos(getJetYPos()); 
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 6, alters its xPos so its centre aligns with the body centre
    * and sets its colour to red.
    */
   public void pulse1()
   {
      //to be written in Q1(c)(i)
      this.jet.setDiameter(6);
      this.jet.setColour(OUColour.RED);
      //int halfRadius = (int)Math.ceil((float)this.jet.getDiameter()/4); //-- THIS WAS ORIGINAL CALCULATION
      //this.jet.setXPos(this.getJetXPos()+halfRadius);// -- THIS WAS ORIGINAL CALCULATION
      this.jet.setXPos(this.getJetXPos()+2); //calculations seem off, but this is what was needed for my display accessibility accommodations
      this.jet.setYPos(this.getJetYPos());
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 12, alters its xPos so its centre aligns with the body centre
    * and sets its colour to orange.
    */     
   public void pulse2()
   {
      //to be written in Q1(c)(ii)
      this.jet.setDiameter(12);
      this.jet.setColour(OUColour.ORANGE);
      //int halfRadius = (int)Math.ceil((float)this.jet.getDiameter()/4); //-- THIS WAS ORIGINAL CALCULATION
      //this.jet.setXPos(this.getJetXPos()+halfRadius);// -- THIS WAS ORIGINAL CALCULATION
      this.jet.setXPos(this.getJetXPos()-1);
      this.jet.setYPos(this.getJetYPos());
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 24, alters its xPos so its centre aligns with the body centre
    * and sets its colour to red.
    */    
   public void pulse3()
   {
      //to be written in Q1(c)(iii)
      this.jet.setDiameter(24);
      this.jet.setColour(OUColour.RED);
      //int halfRadius = (int)Math.ceil((float)this.jet.getDiameter()/4); //-- THIS WAS ORIGINAL CALCULATION
      //this.jet.setXPos(this.getJetXPos()+halfRadius);// -- THIS WAS ORIGINAL CALCULATION
      this.jet.setXPos(this.getJetXPos()-7);
      this.jet.setYPos(this.getJetYPos());
   }

   /**
    * Simulates the ignition of the rocket's jets
    */
   public void ignition()
   {
      //to be written in Q1(d)
      for (int i=0; i<5; i++){
         pulse1();
         this.delay(200);
         pulse2();
         this.delay(200);
         pulse3();
         this.delay(200);
      }
  
   }

   /**
    * Moves the entire rocket in a loop repeated 
    * 100 times, animating the jet as it goes, so the rocket
    * moves upwards by speed units every 4th iteration
    */
   public void animateRocket(int speed)
   {
      //to be written in Q1(e)
      int c=0;
      for (int i=1; i<101; i++){
       
         switch (c){
            case 0:
               pulse1();
               this.delay(200);
               c++;
            case 1:
               pulse2();
               this.delay(200);
               c++;
            case 2:
               pulse3();
               this.delay(200);
               c++;
            case 3:
               this.moveRocketBy(speed);
               c=0;
         }
      }
   }

   /**
    * Prompts the user to enter the number of units they want the  
    * rocket to move upwards at a time (speed)
    * 
    * If the number of units provided would eventually cause the tip of the  
    * nose to go past the top of the Graphical Display, the user 
    * is informed via a dialogue box that the rocket will not launch.  
    * 
    * Otherwise the rocket launches as required. 
    */
   public void launch()
   {
      String userEntry = JOptionPane.showInputDialog("Enter speed:");
      int input = Integer.parseInt(userEntry); 
      int pos = this.nose.getYPos();
      int limit = pos-this.nose.getHeight(); //how far is nose from edge of screen
      if (input >= limit){
         System.out.println("speed too high");
      } else {
         ignition();
         animateRocket(input);
      }
   }

   /**
    * Causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
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
}   