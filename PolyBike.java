package javainterface;

public class PolyBike extends PolyVechicle {
	@Override
	void engine() {
		System.out.println("i am engine in bike");
	}
	
	@Override
	void gear() {
		System.out.println("this is 1st gear in bike");
	}
	
	@Override
	void gear(int a) {
		System.out.println("this is 2nd gear in bike  " +a);
	}
	

}
