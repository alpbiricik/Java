package HW1;

public class Horse extends Mammal{
	//Alp Biricik
		//This class is for horses it extends form mammal 
	private static int count = 0 ;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Horse.count= count;
	}
	public Horse(String name, int age) {
		super(name, age);
		setLegNumber(4);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(1);
		count++;
	}
	@Override
	public void sayGreeting() {
		System.out.println("I will work harder!");
	}
	 public static void decrementCount() {
		   count--;
	   }
	
   }

