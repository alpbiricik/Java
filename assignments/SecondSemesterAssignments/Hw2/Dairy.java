package Hw2;

public class Dairy extends Food {
	//Alp Birick 150122046
		//This class represents real life Dairy it extends from Food
      Dairy(){
	 this(8.0);
     }
      Dairy(double basePrice){
    	  setBasePrice(basePrice);
    	  
    	  
      }
	@Override
	public double calculatePrice() {
		return (int)(((getBasePrice() + (getBasePrice()* getVat())) /10.0 * 13.0) * 100 )/ 100.0;
	}
  
   
}
