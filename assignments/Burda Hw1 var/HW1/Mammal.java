package HW1;

public class Mammal extends Animal {
	//Alp Biricik
		//This class is for mammals it extends form animal 
	public Mammal(String name, int age) {
		super(name, age);
	}
	public void walk() {
		System.out.println("My name is " + super.getName()+ " and I can walk to the far away lands!");
	}
	@Override
	public void reproduce() {
		System.out.println("I give birth!");
	}
	public void herbivore() {
		System.out.println("My name is " + super.getName() +" I can eat plants only!");
	}
     public static void decrementCount() {
		
	}

}
