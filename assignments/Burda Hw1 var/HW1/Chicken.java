package HW1;

public class Chicken extends Bird{
	//Alp Biricik
	//This class is for chickens it extends form bird 
	private static int count = 0 ;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Chicken.count= count;
	}
	public Chicken(String name, int age) {
		super(name, age);
		setLegNumber(2);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(200);
		this.count++;
		
	}
	@Override
	public void sayGreeting() {
		System.out.println("I have nothing to say other than I am against Pigs!");
	}
   public static void decrementCount() {
	   count--;
   }
	
	

}
