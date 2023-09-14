package javainterface;


 class animal{

	public void eat() {
		System.out.println( "eating");
	}
	public void sleep() {
		System.out.println( "sleeping");
	}
	public void roam() {
		System.out.println( "roaming");
	}
}
 
 class lion extends animal{
	 public void roar() {
			System.out.println( "roaring");
		}
	 
 }

public class inheritancesimple  {
	

	public static void main(String[] args) {
		
	lion li=new lion();
		li.eat();
		li.roar();
		li.sleep();
		li.roam();
	}

}
