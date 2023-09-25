package javainterface;

public class Overidding {

	public static void main(String[] args) {
	 eagle e =new eagle();
	 e.eat();
	 e.fly();
	 
	 
	 sparrow e1 =new sparrow();
	 e1.eat();
	 e1.fly();


	}

}
class Birds{
	void fly() {
		System.out.println("flying");
	}
	void eat() {
		System.out.println("eating");
	}

}


class eagle extends Birds{

	void fly() {
		System.out.println("eagle flys very high");
	}

}

class sparrow extends Birds {
	void fly() {
		System.out.println("sparrow flys ");
	}
	
}