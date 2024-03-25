package HW1;

public class Pig extends Mammal {
	//Alp Biricik
	//This class is for pigs it extends form mammal 
	private static int count = 0 ;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pig.count= count;
	}
	public Pig(String name, int age) {
		super(name, age);
		setLegNumber(4);
		setNumberOfOffsprings(12);
		setPregnancyPerYear(2);
		count++;	
		}
	@Override
	public void sayGreeting() {
		System.out.println("All animals are equal, but some animals are more equal than others!");
	}
   public static void decrementCount() {
	   count--;
   }

}
