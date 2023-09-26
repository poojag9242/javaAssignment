package javainterface;

 class Encap1 {

	public static void main(String[] args) {
		Encap b=new Encap();
		System.out.println(b.getpage());
		b.setpage(8);
		System.out.println(b.getpage());
		
		Encap b1=new Encap();
		b1.setpage(9);
		System.out.println(b1.getpage());

	}

}

public class Encap{
	
	private int page=10 ;
	
	public void setpage(int page) {
		this.page=page;
	}
	
	public int getpage() {
		return page;
	}
}