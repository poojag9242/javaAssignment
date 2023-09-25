package javainterface;


class  Rectangle1 implements Polygon {
	
	  public void getArea() {
	    //int a = 6;
	    //int b = 5;
	    int area=a * b;
	  
	    System.out.println("The area of the rectangle is " +area);
	  }

	  // overrides the getSides()
	  public void getSides() {
	    System.out.println("I have 4 sides.");
	  }
	}