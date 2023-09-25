package javainterface;

public abstract class DemoAbstract  implements DemoInterface{
	int var=10;
	
	public void run() {
		System.out.println("running");
	}
	
	abstract void eat();
	
	public static void sleep() {
		System.out.println("sleeping");
	}
	

}
