package javainterface;

public interface Polygon {
	
	void getArea();//abstract method
	
	public static void display() {  //static method
		  System.out.println(" one of polygon ");
	  }

	  // default method 
	  default void getSides() {
	    System.out.println("I can get sides of a polygon.");
	  }
	}



