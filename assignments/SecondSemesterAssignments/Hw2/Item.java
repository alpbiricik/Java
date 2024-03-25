package Hw2;

abstract public class Item {
	//Alp Birick 150122046
		//This class represents all kind of Items
	private double vat;
	private double basePrice;
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	
	abstract public double calculatePrice();
	
}
