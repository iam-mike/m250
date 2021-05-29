import ou.*;

/**
 * This class models a Lollipop shape, which has-a stick and has-a sweet 
 * (it is composed of these objects). A Lollipop can be licked, which makes 
 * the sweet part grow smaller and the stick change colour.
 *  
 * @author M250  
 * @version 1.0
 */
public class Lollipop
{
   private Circle sweet; //A Lollipop has-a Circle identified by sweet
   private Rectangle stick; //A Lollipop has-a Rectangle identified by stick
   private int licks; //Count how many times this lollipop has been licked

   //A lollipop also has some default colours and sizes associated with it, 
   //but these are not made visible to the outside world directly 
   //(i.e., they are not gettable).
   private static final OUColour SWEET_COLOUR = OUColour.RED;
   private static final OUColour STICK_COLOUR = new OUColour(200,200,200);
   private static final int SIZE = 100; //sweet diameter and stick height
   private static final int STICK_WIDTH = 10;    

   /**
    * Constructor for objects of class Lollipop that 
    * provides a default lollipop near the centre of the graphical display.
    */
   public Lollipop()
   {
      //a default diameter red Circle
      Circle c = new Circle(SIZE, SWEET_COLOUR);  

      //set the circle's position
      c.setXPos(75);
      c.setYPos(75);

      //initialise the sweet component of the lollipop to refer to the circle
      this.sweet = c; 

      //initialise the stick component to refer to default rectangle
      this.stick = new Rectangle(STICK_WIDTH, SIZE, STICK_COLOUR);
      
		this.attachStick();
      
      this.licks = 0; //has never been licked!
   }
      
   /**
    * Two-argument Constructor for objects of class Lollipop that allows the
    * user to provide a sweet and a stick. They might not join up, so we need to 
    * attach them to one another.
    */
   public Lollipop(Circle aSweet, Rectangle aStick)
   {
      this.sweet = aSweet;
      this.stick = aStick;

      this.attachStick();
		
		this.licks = 0;
   }

   /**
    * Attach a stick to an existing sweet. 
    * The sweet must have been initialised already.
   */
   private void attachStick()
   {
      int radius = this.sweet.getDiameter() / 2;

      //move stick to the right to reach the centre of the sweet
      this.stick.setXPos(this.sweet.getXPos() + radius - this.stick.getWidth() / 2); 
      
      //move stick down near the bottom of the sweet
      this.stick.setYPos(this.sweet.getYPos() + this.sweet.getDiameter() - STICK_WIDTH); 
   }

   /**
   * Method to move a lollipop horizontally. 
   * The direction depends on the sign of the argument.
   */
   public void horiz(int xinc)
   {
      this.sweet.setXPos(this.sweet.getXPos() + xinc);
      this.stick.setXPos(this.stick.getXPos() + xinc);
   }

   /**
   * Method to move a lollipop vertically. 
   * The direction depends on the sign of the argument.
   */
   public void vert(int yinc)
   {
      this.sweet.setYPos(this.sweet.getYPos() + yinc);
      this.stick.setYPos(this.stick.getYPos() + yinc);
   }

   /**
    * When you lick a lollipop, its sweet shrinks and 
    * its stick changes colour to get closer to the sweet's colour. 
    * It is not important to understand the details of this method.
    */
   public void lick()
   {
      if (this.sweet.getDiameter() > 1) //can't go below zero size
      {            
         this.licks++;  //we've been licked
         
         this.sweet.setDiameter(this.sweet.getDiameter() - 2);
         //We need to move the sweet so it stays on the stick when it gets smaller
         //(If we used attachStick, the lollipop would move when licked.) 
         //This is because the circle is drawn relative to the 
         //top-left corner of its bounding box.
         this.sweet.setXPos(this.sweet.getXPos() + 1); 
         this.sweet.setYPos(this.sweet.getYPos() + 2); 

         //Transfer some colour to the stick.
         //First find out what the current stick colour is
         OUColour stickCol = this.stick.getColour();
         int str = stickCol.getRed();
         int stg = stickCol.getGreen();
         int stb = stickCol.getBlue();            

         //And what colour the sweet is
         OUColour sweetCol = this.sweet.getColour();
         int swr = sweetCol.getRed();
         int swg = sweetCol.getGreen();
         int swb = sweetCol.getBlue();

         //Now add some colour from the sweet to the stick! 
         //Fudge factor:  1/50th of the difference between the colours of
         //the sweet and the stick is added to the stick colour
         OUColour newCol = new OUColour(str + (swr - str) / 50, 
                                        stg + (swg - stg) / 50, 
                                        stb + (swb - stb) / 50); 

         this.stick.setColour(newCol); //transfer colour
      }
      else
      {
         OUDialog.alert("It's all gone!");
      }

   }
    
   /**
   * Allow the workspace to see the stick part of a lollipop.
   */
   public Rectangle getStick()
   {
      return this.stick;
   }

   /**
   * Allow the workspace to see the sweet part of the lollipop.
   */
   public Circle getSweet()
   {
      return this.sweet;
   }
   
   /**
    * Returns the number of times this lollipop has been licked.
    */  
   public int getLicks()
   {
      return this.licks;
   }
}