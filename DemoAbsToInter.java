package javainterface;

public class DemoAbsToInter extends DemoAbstract {
	
//abstract implements  interface
	
	public static void main(String[] args) {
		DemoAbsToInter d=new DemoAbsToInter();
		d.go();
		d.come();
		d.eat();
		
		
	}



@Override
public void go() {
	System.out.println("going");
	
}

@Override
public void come() {
	System.out.println("going");
	
}

@Override
void eat() {
	System.out.println("going");
	
}
}

