//Activity 1
Frog frog1 = new Frog();
Frog frog2 = new Frog();
HoverFrog hoverFrog1 = new HoverFrog();
HoverFrog hoverFrog2 = new HoverFrog();
frog2.setPosition(11);
frog2.setColour(OUColour.PURPLE);
hoverFrog2.setPosition(5);
hoverFrog2.setColour(OUColour.RED);
hoverFrog2.setHeight(4);

//Test your completed sameStateAs() method by executing the following four statements (one by one):

frog1.sameStateAs(frog2);
hoverFrog1.sameStateAs(hoverFrog2);
frog2.sameStateAs(hoverFrog1);
hoverFrog2.sameStateAs(frog1);
