/** Activity 15 **/

Frog freda;
HoverFrog houdini; 
Account myAccount; 
CurrentAccount yourAccount; 
             
/*(a) Attempt to assign a HoverFrog to a Frog variable */
        freda = new HoverFrog();   
/*(b) Attempt to assign a Frog to a HoverFrog variable */
        houdini = new Frog();
/*(c) Attempt to assign a CurrentAccount to an Account variable */
        myAccount = new CurrentAccount(); 
/*(d) Attempt to assign an Account to a CurrentAccount variable */
        yourAccount = new Account(); 

/** Activity 16 **/ 

/*(a) Attempt to declare a variable of an abstract type */
          Amphibian amy;
/*(b) Attempt to create an instance of an abstract type */
          amy = new Amphibian();
/*(c) Attempt to assign a Frog to an Amphibian variable */
          amy = new Frog();
/*(d) Attempt to asign a Toad to an Amphibian variable */
          amy = new Toad();
/*(e) Attempt to assign a HoverFrog to an Amphibian variable */
          amy = new HoverFrog();
/*(f) Attempt to assign a Toad to a Frog variable */
          Frog felix = new Toad();
          
/** Activity 17 **/
     
HoverFrog houdini = new HoverFrog();
HoverFrog hercules = new HoverFrog();
Toad titan = new Toad();
Account myAccount = new Account("me","1234",500.00);
Account yourAccount = new CurrentAccount("you","5678",700.00,200.00,"3333");
        
/* (a)Attempt to set the colour of a HoverFrog to the same colour as another HoverFrog */
      houdini.setColour(OUColour.BLUE);
      hercules.sameColourAs(houdini);
      System.out.println("hercules's colour is now " + hercules.getColour());
         
/* (b)Attempt to set the colour of a HoverFrog to the same colour as a Toad */
         hercules.sameColourAs(titan);
         System.out.println("hercules's colour is now " + hercules.getColour());
         
/* (c)Attempt to transfer from an Account to a CurrentAccount */
         myAccount.transfer(yourAccount, 200);
         System.out.println("Balance of myAccount is now " + myAccount.getBalance());
         System.out.println("Balance of yourAccount is now " + yourAccount.getBalance());
         
/** Activity 18 **/
     
/* (a) Attempt to set the colour of a HoverFrog referenced by a Frog variable */         
         Frog freda = new HoverFrog();
         freda.setColour(OUColour.RED); 
         System.out.println("freda's colour is now " + freda.getColour());
      
/* (b) Attempt to set the height of a HoverFrog referenced by a Frog variable */
         freda.setHeight(4);
         System.out.println("freda's height is now " + freda.getHeight());
