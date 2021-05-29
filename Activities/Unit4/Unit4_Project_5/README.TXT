//Activity 27: Circles and other shapes...

Circle aCircle = new Circle();
Diamond aDiamond = new Diamond();
Triangle aTriangle = new Triangle();
Square aSquare = new Square();

Circle aCircle = new Circle(50, OUColour.YELLOW);
Diamond aDiamond = new Diamond(75, 120, OUColour.RED);
Triangle aTriangle = new Triangle(20, 100, OUColour.PURPLE);
Square aSquare = new Square(60, OUColour.GREEN);

//Activity 29: Marionette

Marionette woodenTop = new Marionette();

Circle circle1 = woodenTop.getHead();
Diamond diamond1 = woodenTop.getBody();
Triangle triangle1 = woodenTop.getLeftLeg();
Triangle triangle2 = woodenTop.getRightLeg();
woodenTop.right(20);
woodenTop.right(20);

//Activity 30: testing the left() method

Marionette woodenTop = new Marionette();
Circle circle1 = woodenTop.getHead();
Diamond diamond1 = woodenTop.getBody();
Triangle triangle1 = woodenTop.getLeftLeg();
Triangle triangle2 = woodenTop.getRightLeg();
woodenTop.left(20);

//Activity 31 - add arms to Marionette

Marionette woodenTop = new Marionette();
Circle aCircle = woodenTop.getHead();
Diamond diamond1 = woodenTop.getBody();
Triangle triangle1 = woodenTop.getLeftLeg();
Triangle triangle2 = woodenTop.getRightLeg();
Diamond diamond2 = woodenTop.getLeftArm();
Diamond diamond3 = woodenTop.getRightArm();
woodenTop.right(50);
woodenTop.left(50);
woodenTop.up(50);
woodenTop.down(50);
