package Hw2;

public class Underware extends Clothing{
	//Alp Birick 150122046
		//This class represents real life Underware it extends from Clothing 
	Underware(){
		this(30.0);
	}
	Underware(double basePrice){
		setBasePrice(basePrice);
	}
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return (int)(((getBasePrice() + (getBasePrice() * getVat())) /100.0 * 145.0) * 100 )/ 100.0;
	}
 @Override
   public void howToWash(){
	 System.out.println("Wash underware at 60 degrees.");
 }
}
