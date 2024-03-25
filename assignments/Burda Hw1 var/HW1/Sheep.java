package HW1;

public class Sheep extends Mammal{
	//Alp Biricik
		//This class is for sheep it extends form mammal 
	private static int count = 0 ;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Sheep.count= count;
	}
	
	public Sheep(String name, int age) {
		super(name, age);
		setLegNumber(4);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(1);
		count++;
		}
	@Override
	public void sayGreeting() {
		System.out.println("Four legs good, two legs better!");
	}
   public static void decrementCount() {
	   count--;
   }

}
