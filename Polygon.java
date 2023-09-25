package javainterface;

public interface Polygon {
	static int a=19;
	 final int b=2;
	 int c=1;
	 public int d=2;
	void getArea();//abstract method
	
	public static void display() {  //static method
		  System.out.println(" one of polygon ");
	  }

	  // default method 
	  default void getSides() {
	    System.out.println("I can get sides of a polygon.");
	  }
	}



