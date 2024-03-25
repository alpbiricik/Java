package Hw2;

public class Vegetable extends Food implements Vegan, Washable {
	//Alp Birick 150122046
		//This class represents real life vegetables  it extends from Food and implements Washable and Vegan
	Vegetable(){
		this(10.0);
	}
	Vegetable(double basePrice){
		setBasePrice(basePrice);
	}
	
	@Override
	public void howToWash() {
		System.out.println("Wash vegetable with warm water.");
	}

	@Override
	public void madeOf() {
        System.out.println("It is made only of vegetables.");		
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return (int)(((getBasePrice() + (getBasePrice() * getVat())) /100.0 * 125.0) * 100 )/ 100.0;
	}

}
