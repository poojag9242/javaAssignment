package javainterface;


class  Rectangle1 implements Polygon {
	
	  public void getArea() {
	    int length = 6;
	    int breadth = 5;
	    int area=length * breadth;
	  
	    System.out.println("The area of the rectangle is " +length * breadth);
	  }

	  // overrides the getSides()
	  public void getSides() {
	    System.out.println("I have 4 sides.");
	  }
	}