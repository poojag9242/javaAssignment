package javainterface;
//hierachial interface
class SBI implements Bank {  
	public float rateOfInterest()
	{
		return 9.15f;
	}
	}  
	
	class PNB implements Bank {  
	public float rateOfInterest()
			{
		return 8.7f;
		}  
	}  
	
	class TestInterface2 {  
		
	public static void main(String[] args) {  
	Bank b=new SBI(); 
	b.rateOfInterest();
	System.out.println("Rate of interest of SBI: "+b.rateOfInterest());  
	
	
    Bank b1=new PNB(); 
    b1.rateOfInterest();
	System.out.println("Rate of interest of PNB: "+b1.rateOfInterest());  
	}
	}  