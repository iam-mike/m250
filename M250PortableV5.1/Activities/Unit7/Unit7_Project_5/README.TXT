//Activity 5

BarnDanceCaller caller = new BarnDanceCaller();

//Inspect caller to confirm that the instance variables dancer1 and dancer2 do not reference Frog objects but hold the value null.
//Now create two frogs using the following code:

Frog sam = new Frog();
sam.setColour(OUColour.PURPLE);
Frog lew = new Frog();
lew.setColour(OUColour.YELLOW);

caller.setDancers(sam, lew);

caller.takeUpYourPositions();
