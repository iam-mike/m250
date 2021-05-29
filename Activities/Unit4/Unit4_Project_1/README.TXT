-------------------------------------------------------------
This is the project README file. 
Use this file for making notes on your work on this project.
-------------------------------------------------------------

Activity 2

1 In the OUWorkspace execute the following code:

Frog kermit = new Frog();
Frog kermella = new Frog();
Frog frogulika = new Frog();
kermit.setColour(OUColour.RED);
kermella.setColour(OUColour.YELLOW);
frogulika.setColour(OUColour.BLUE);

Next, execute the following statements one at a time, observing the results in the Display Pane:

kermit.whoAreYou();
kermella.whoAreYou();
frogulika.whoAreYou();

2 Explain what you see when you execute the following code in the OUWorkspace:

System.out.println(kermit == kermit.whoAreYou());    //A
System.out.println(kermella == kermella.whoAreYou());  //B
System.out.println(kermit == kermella.whoAreYou());   //C
