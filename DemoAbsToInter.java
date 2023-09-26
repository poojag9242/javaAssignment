package javainterface;

public class DemoAbsToInter extends DemoAbstract {
	
//abstract implements  interface
	
	public static void main(String[] args) {
		DemoAbsToInter d=new DemoAbsToInter();
		d.go();
		d.come();
		d.eat();
		DemoAbstract.sleep();
		d.run();
	}



@Override
public void go() {
	System.out.println("going");
	
}

@Override
public void come() {
	System.out.println("coming");
	
}

@Override
void eat() {
	System.out.println("eating");
	
}
}

