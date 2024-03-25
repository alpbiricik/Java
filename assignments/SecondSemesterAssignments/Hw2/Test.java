package Hw2;

public class Test {
	//Alp Birick 150122046
		//This class is a test class for shopping mall
	static ShoppingMall shoppingMall = new ShoppingMall();

	public static void main(String[] args) {
       shoppingMall.addDairy();
       shoppingMall.addFruit();
       shoppingMall.addTop();
       shoppingMall.addTrousers();
       shoppingMall.addUnderware();
       shoppingMall.addVegetable();
       shoppingMall.addArbitrary(new Top(100.0));  
       printContent();
       printWashingInstructions();
       System.out.println(shoppingMall.bill()); 
	}
	
	public static void printContent() {
		for(Item s : shoppingMall.getItems()) {
			if(s instanceof Vegan) {
				((Vegan) s).madeOf();
			}
		}
	}
	public static void printWashingInstructions() {
		for(Item s : shoppingMall.getItems()) {
			if(s instanceof Washable) {
				((Washable) s).howToWash();
			}
		}
	}
}
