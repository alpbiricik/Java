package Hw2;

public class Fruit extends Food implements Vegan, Washable{
	//Alp Birick 150122046
		//This class represents real life Fruit it extends from Food and implements Washable and Vegan
	Fruit(){
	  this(6.0);
    }
     
     Fruit(double basePrice){
    	 setBasePrice(basePrice);
    	 
     }

	@Override
	public void howToWash() {
		System.out.println("Wash Fruit with cold water.");
	}

	@Override
	public void madeOf() {
		System.out.println("It is made only of fruit.");
	}

	@Override
	public double calculatePrice() {
		return (int)(((getBasePrice() + (getBasePrice() * getVat())) /10.0 * 12.0) * 100 )/ 100.0;
	}
  
}
