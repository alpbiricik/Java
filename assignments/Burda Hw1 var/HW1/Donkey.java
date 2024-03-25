package HW1;

public class Donkey extends Mammal{
	//Alp Biricik
	//This class is for donkeys it extends form mammal 
	private static int count = 0 ;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Donkey.count= count;
	}

	public Donkey(String name, int age) {
		super(name, age);
		setLegNumber(4);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(1);
		count++;
	}
	@Override
	public void sayGreeting() {
		System.out.println("Life will go on as it has always gone –that is, badly!");
	}
   public static void decrementCount() {
	   count--;
   }
	

}
