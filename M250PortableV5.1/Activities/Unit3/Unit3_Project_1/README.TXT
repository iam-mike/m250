-------------------------------------------------------------
This is the project README file. 
Use this file for making notes on your work on this project.
-------------------------------------------------------------

=== ACTIVITY 1 ===

//1	Type the following code into the Code Pane (remembering the semicolons).

int myNumber;
myNumber = 17;

 Ensure that the Show Results check box is checked. 
Now highlight both lines of code and execute them by selecting Execute Selected from the Action menu 
What do you see in the Display Pane (bottom left) and in the Variables Pane (bottom right)?
What happens when you double-click the variable name in the Variables Pane?

//2	Close the Inspector window and type in the following statement.

myNumber = 45;

Select and execute the statement. Inspect the variable myNumber.

//3	Clear the Code Pane and the Display Pane by choosing the appropriate items from the Action menu. (You will be asked if you want to save the code in the code pane. You can answer 'No' to this.)
Now enter the following statement into the Code Pane, highlight it and then execute it.

yourNumber = 34;

What happens? Try to explain it. What happens when you double-click the variable name in the Variables Pane?

//4	Enter and execute the following statement.

int yourNumber;

Describe what happens.

//5	Enter and execute a pair of statements that will declare a character variable called choice and give it the value 'Q'.

=== ACTIVITY 2 ====

//1 Enter and execute

Frog kermit = null;

Inspect the variable kermit.

//2	Now enter and execute the statement

kermit = new Frog();

	Inspect the variable kermit.

//3	Now enter and execute the statements

kermit.right();
kermit.right();
kermit.setColour(OUColour.BROWN);

	Inspect kermit.

//4	Next enter and execute the statement

kermit = new Frog();

	and inspect kermit once again.
	
//5	Open the Graphical display and try things like:

kermit.right(); 
kermit.setColour(OUColour.PURPLE);
kermit.left();

=== ACTIVITY 3 ====

int anInt;
double aDouble;
boolean aBool;
int myNumber = 17;
int yourNumber = 5;

anInt = myNumber - 15;
anInt = myNumber * yourNumber;
anInt = myNumber / yourNumber;
aDouble = myNumber / yourNumber;
aBool = yourNumber > myNumber;
aBool = yourNumber != myNumber;
anInt = myNumber % yourNumber;
aDouble = 7 / 2;
aDouble = 7.0 / 2;
anInt = 3 * (7 + 2);
anInt = (3 * 7) + 2;
aBool = (7 - (5 - 2)) > (-8 / 2);
aBool = (3 <= 7) && (7 < 9);
anInt = (6 + 4) / (6 - 4);
anInt = 3 * (2 + 11);
anInt = (13 + 2) % 7;
anInt = 25 - (6 - 2);

Can you understand the error messages for the code below?

anInt = 22 / 11) + 4;
aBool = (22 / 11 + 4;

=== ACTIVITY 4 ====

Frog kermit = new Frog();
kermit.right();
kermit.setColour(OUColour.RED);

System.out.println(kermit.getPosition());
System.out.println(kermit.getColour());
System.out.println("Milk".concat("Wood"));
System.out.println("Milk ".concat("Wood"));
System.out.println("Milk".concat(" Wood"));
System.out.println("Under Milk ".concat("Wood"));
System.out.println("Milk " + "Wood");
System.out.println("It is " + "raining.");
System.out.println("He wouldn't say \"boo\" to a goose");
System.out.println("The End of the Line".toUpperCase());

String cat1 = "cat";
String cat2 = "CAT".toLowerCase();
String cat3 = cat1;
String dog = "dog";
System.out.println("Your output is");
System.out.println(cat1 == cat2);
System.out.println(cat1 == cat3);
System.out.println(cat1.equals(cat2));
System.out.println(cat1 == dog);
System.out.println(cat1.equals(dog));


=== ACTIVITY 5 ====

Try the following in the workspace and explain what you see.

//1

int anInt = 17.5;

//2

double aDouble;
aDouble = 17;

//3   

int anotherInt = aDouble;
	
//4	

aDouble = 17.5;

=== ACTIVITY 6 ===

aDouble = 17 / 5;
anInt = 17;
Double = anInt / 5;

double anotherDouble = 17;
aDouble = anotherDouble / 5;

aDouble = 23E456;
aDouble = 17 / 0;

=== ACTIVITY 7 ===

Frog kermit = null;
Frog gribbit = null;
HoverFrog happy = null;
HoverFrog bouncy = null;

kermit = new Frog();
happy = new HoverFrog();
kermit.right();
kermit.right();
happy.setColour(OUColour.RED);
gribbit = kermit;
gribbit.setColour(OUColour.BLUE);
kermit.right();
bouncy = kermit; 
kermit = happy;
happy.up();
kermit.up(); 

=== ACTIVITY 8 ===

//1

Frog kermit;
Frog perseus;
kermit = new Frog();

//2	

kermit.setColour(OUColour.BROWN);
kermit.right();
kermit.right();

//3

perseus = kermit;

perseus.setPosition(1);
perseus.right();
kermit.right();
perseus.right();
kermit.right();

//4

perseus = new Frog();

//5	

kermit.right();
	
//6

perseus.setColour(OUColour.BLUE);
	
//7

perseus = kermit;

=== ACTIVITY 9 ===

//1

Frog kermit = new Frog();
String str;
str = kermit.toString();

	What has been written in the Display Pane?
	From the list of variables double-click on str to inspect it. What does the inspector show?
	
//2	

kermit.toString();

	Note the textual representation of the result shown in the Display Pane. 
	Why do you think that the results shown in the Display Pane are similar for steps 1 and 2? 
	
//3	To confirm your ideas, repeat steps 1 and 2 with an Account object.