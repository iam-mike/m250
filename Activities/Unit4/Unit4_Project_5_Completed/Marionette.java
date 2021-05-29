import ou.*;

/**
 * Objects of class Marionette represent puppet-like characters 
 * made up of Circle, Diamond and Triangle objects.
 *
 * @author M250 Module Team 
 * @version 2.5
 */
public class Marionette
{
   /* Instance variables */
   private int xPos;     // The horizontal position of a marionette
   private int yPos;     // The vertical position of a marionette
   private Diamond body; 
   private Circle head; 
   private Triangle rightLeg; 
   private Triangle leftLeg; 

   //Added instance variables
   private Diamond leftArm;
   private Diamond rightArm;

   /**
    * Constructor for objects of class Marionette.
    */
   public Marionette()
   {
      super();
      this.head = new Circle(40, OUColour.BLUE);
      this.body = new Diamond(30, 100, OUColour.RED);
      this.leftLeg = new Triangle(10, 100, OUColour.GREEN);
      this.rightLeg = new Triangle(10, 100, OUColour.GREEN);
      this.xPos = 100;
      this.yPos = 100;

      //Added initialisation
      this.leftArm = new Diamond(40, 15, OUColour.YELLOW);
      this.rightArm = new Diamond(40, 15, OUColour.YELLOW);

      this.alignAll();
   }       

   /* Instance methods */
   /**
    * Sets the xPos of the receiver to the value of the argument.
    */
   private void setXPos(int newPos)
   {
      this.xPos = newPos;
      //change in xPos requires realignment of body parts
      this.alignAll(); 
   }

   /**
    * Returns the xPos of the receiver.
    */
   private int getXPos()
   {
      return this.xPos;
   }

   /**
    * Sets the yPos of the receiver to the value of the argument.
    */
   private void setYPos(int newPos)
   {
      this.yPos = newPos;
      //change in yPos requires realignment of body parts
      this.alignAll(); 
   }

   /**
    * Returns the yPos of the receiver.
    */
   private int getYPos()
   {
      return this.yPos;
   }

   /**
    * Increments the xPos of the receiver by the value of the argument.
    */
   public void right(int increment)
   {
      this.setXPos(this.getXPos() + increment); 
   }

   /**
    * Decrements the yPos of the receiver by the value of the argument.
    */
   public void up(int decrement)
   {
      this.setYPos(this.getYPos() - decrement);        
   }

   /**
    * Increments the yPos of the receiver by the value of the argument.
    */
   public void down(int increment)
   {
      this.setYPos(this.getYPos() + increment);        
   }

   /**
    * Aligns all the body parts of the receiver to form a marionette-type figure.
    */
   private void alignAll()
   {
      this.alignBody();
      this.alignHead();
      this.alignLeftLeg();
      this.alignRightLeg();

      //added alignment for arms
      this.alignLeftArm();
      this.alignRightArm();
   }    

   /**
    * Aligns the head of the receiver relative to the xPos and yPos of the receiver.
    */
   private void alignHead()
   {
      this.getHead().setXPos(this.getXPos() - 5);
      this.getHead().setYPos(this.getYPos() - 35);
   }

   /**
    * Aligns the body of the receiver relative to the xPos and yPos of the receiver.
    */
   private void alignBody()
   {
      this.getBody().setXPos(this.getXPos());
      this.getBody().setYPos(this.getYPos());
   }

   /**
    * Aligns the leftLeg of the receiver relative to the xPos and yPos of the receiver.
    */
   private void alignLeftLeg()
   {
      this.getLeftLeg().setXPos(this.getXPos());
      this.getLeftLeg().setYPos(this.getYPos() + 65);
   }

   /**
    * Aligns the rightLeg of the receiver relative to the xPos and yPos of the receiver.
    */
   private void alignRightLeg()
   {
      this.getRightLeg().setXPos(this.getXPos() + 20);
      this.getRightLeg().setYPos(this.getYPos() + 65);
   }

   // Public getter methods for the body parts so that they can be made
   // available to the OUWorkspace and be displayed by the Shapes window

   /**
    * Returns  a reference to the body of the receiver.
    */
   public Diamond getBody()
   {
      return this.body;   
   }

   /**
    * Returns a reference to the head of the receiver.
    */
   public Circle getHead()
   {
      return this.head;   
   }

   /**
    * Returns a reference to the rightLeg of the receiver.
    */
   public Triangle getRightLeg()
   {
      return this.rightLeg;   
   }

   /**
    * Returns a reference to the leftLeg of the receiver.
    */
   public Triangle getLeftLeg()
   {
      return this.leftLeg;   
   }

   //Added instance methods
   /**
    * Decrements the xPos of the receiver by the value of the argument.
    */
   public void left(int decrement)
   {
      this.setXPos(this.getXPos() - decrement);        
   }

   /**
    * Returns a reference to the rightArm of the receiver.
    */
   public Diamond getRightArm()
   {
      return this.rightArm;   
   }

   /**
    * Returns a reference to the leftArm of the receiver.
    */
   public Diamond getLeftArm()
   {
      return this.leftArm;   
   }

   /**
    * Aligns the leftArm of the receiver relative to the xPos 
    * and yPos of the receiver.
    */
   private void alignLeftArm()
   {
      this.getLeftArm().setXPos(this.getXPos() - 35);
      this.getLeftArm().setYPos(this.getYPos() + 25);
   }  

   /**
    * Aligns the rightArm of the receiver relative to the xPos 
    * and yPos of the receiver.
    */
   private void alignRightArm()
   {
      this.getRightArm().setXPos(this.getXPos() + 25);
      this.getRightArm().setYPos(this.getYPos() + 25);
   }  
}