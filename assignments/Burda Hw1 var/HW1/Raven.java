package HW1;

public class Raven extends Bird{
	//Alp Biricik
    //This class is for ravens it extends form bird 
	private static int count = 0 ;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Raven.count= count;
	}
	public Raven(String name, int age) {
		super(name, age);
		setLegNumber(2);
		setNumberOfOffsprings(5);
		setPregnancyPerYear(1);
		count++;
		}
	@Override
	public void sayGreeting() {
		System.out.println("A happy country where we poor animals shall rest forever!");
	}
   public static void decrementCount() {
	   count--;
   }

}
