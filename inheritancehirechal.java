package javainterface;


class Animal {
	
public void eat() {
System.out.println("Animal is eating");
}

		}

class Cat extends Animal {

public void meow() {
System.out.println("Cat is meowing");
 }

}

class Dog extends Animal {
public void bark() {

		  System.out.println("Dog is barking");

		    }

		}

		public class inheritancehirechal{

		    public static void main(String[] args) {

		        Cat c = new Cat();

		        c.eat(); 

		        c.meow(); 
		        

		        Dog d = new Dog();

		        d.eat(); 

		        d.bark(); 

		    }

		

	}


