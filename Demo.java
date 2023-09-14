package javainterface;

public class Demo {

	public static void main(String[] args) {
		Drawable d;
		d=new Rectangle();
		d.draw();
		
		Triangle t=new Triangle();
		t.draw();
		
		d=new cirle();
		d.draw();
		

	}

}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("draw rectangle");
	}	
}

class Triangle implements Drawable{
	public void draw() {
		System.out.println("draw triangle");
	}	
}

class cirle implements Drawable{
	public void draw() {
		System.out.println("draw circle");
	}
}