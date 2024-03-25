package Hw2;

abstract public class Clothing extends Item implements Washable {
//Alp Birick 150122046
	//This class represents real life Clothes it extends from Item and implements Washable
	Clothing(){
		setVat(0.18);
	}
	@Override
	public void howToWash() {
		
	}

}
