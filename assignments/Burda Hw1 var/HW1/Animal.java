package HW1;

public class Animal {
	//Alp Biricik
		//This class is for all the animals its the super class of all 
	private String name;
	private int legNumber;
	private int age;
	private int pregnancyPerYear;
	private int numberOfOffsprings;
	public Animal(String name,int age) {
		
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegNumber() {
		return legNumber;
	}
	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPregnancyPerYear() {
		return pregnancyPerYear;
	}
	public void setPregnancyPerYear(int pregnancyPerYear) {
		this.pregnancyPerYear = pregnancyPerYear;
	}
	public int getNumberOfOffsprings() {
		return numberOfOffsprings;
	}
	public void setNumberOfOffsprings(int numberOfOffsprings) {
		this.numberOfOffsprings = numberOfOffsprings;
	}
	public void sayGreeting() {
	System.out.println("Have nothing to say!");	
	}
	public void reproduce() {
	System.out.println("None of your bussines!!");
	}
	public String toString() {
		return("My name is " + name+"!\n"+"I am "+ age + " years old!\n"+"I have "+ legNumber + " legs!");
	}
	
	
	

}
