package javainterface;

public class Mobile1  extends Iphone {

	

	
	public void Appstore() {
		System.out.println("Download apps");
		
	}

	public void playstore() {
		System.out.println("Download apps");
		
	}
	
	public static void main(String[] args) {
		Mobile1 mb =new  Mobile1();
		mb.Appstore();
          mb.playstore();
          mb.cost();
          MobAndriod.charger();
	}

}
