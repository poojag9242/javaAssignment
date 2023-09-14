package javainterface;

class animal1{

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
 
 class lion1 extends animal1{
	 public void roar() {
			System.out.println( "roaring");
		}
	 
 }
 class cub extends lion1{
 public void  learn() {
	 System.out.println("learn hunting");
 }
 }
 
public class inheritancemulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           cub c=new cub();
        c.eat();
   		c.roar();
   		c.sleep();
   		c.roam();
   		c.learn();
   
	}

}
