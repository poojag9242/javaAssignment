package javainterface;

public class xerox implements Print,show {
	public void print() {
		System.out.println("printing");
	}
	public void view() {
		System.out.println("viewing");
	}
	

	public static void main(String[] args) {
		xerox xc=new xerox();
		xc.print();
		xc.view();
		

	}

}
