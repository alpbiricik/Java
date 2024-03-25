package Hw2;

public class Top extends Clothing {
	//Alp Birick 150122046
		//This class represents real life Top it extends from Clothing 
	Top(){
		this(20.0);
	}
	Top(double basePrice){
		setBasePrice(basePrice);
	}

	@Override
	public double calculatePrice() {
		
		return (int)(((getBasePrice() + (getBasePrice() * getVat())) /10.0 * 12.0) * 100 )/ 100.0;
	}
	@Override
	public void howToWash() {
		System.out.println("Wash Top at 40 degrees");
	}

}
