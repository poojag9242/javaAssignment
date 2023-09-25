package javainterface;

public class Overloading {

	public static void main(String[] args) {
		calci c = new calci();
		c.add();
		c.add(10,20);
		c.add(10, 20, 20);
		c.add(30.22, 'w', 30.22);
	    c.add(22.1, 5, 8);
		c.add(12, 'q', 10);
		c.add(2.2, 1, 2);
		c.add(1, 12, 22.3, 11.11);

	}

}
  class calci {
	
	  void add() {
	  System.out.println("addition");
	  }
	  
	 void add(int a ,int b) {
		System.out.println(a+b);
	}
	 void add(int a ,int b,int c) {
			System.out.println(a+b+c);
		}
	 public void add (double a, char b, double c) {
			System.out.println(a+b+c);
			
		}
	 void add(float a ,int b,int c) {
			System.out.println(a+b+c);
		}
	 void add(int a ,char b,int c) {
			System.out.println(a+b+c);
		}
	 double  add(double a ,int b,int c) {
			System.out.println(a+b+c);
			return a+b+c;
		}
	 void add(int a ,int b,double  d ,double e) {
			System.out.println(a+b+d+e);
		}
}