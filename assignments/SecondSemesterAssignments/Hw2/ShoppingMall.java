package Hw2;

import java.util.ArrayList;

public class ShoppingMall {
	//Alp Birick 150122046
		//This class represents real life Shopping Mall
	
    private ArrayList<Item> items = new ArrayList<Item>();

    public ArrayList<Item> getItems() {
	return items;
   }
    public void addDairy() {
    	Dairy dairy = new Dairy();
	    items.add(dairy);
   }
    public void addFruit() {
    	Fruit fruit = new Fruit();
    	items.add(fruit);
    }
    public void addTop() {
    	Top top = new Top();
    	items.add(top);
    }
    public void addTrousers() {
    	Trousers trousers = new Trousers();
    	items.add(trousers);
    }
    public void addUnderware() {
    	Underware underware = new Underware();
    	items.add(underware);
    }
    public void addVegetable() {
	    Vegetable vegetable = new Vegetable();
	    items.add(vegetable);
    }
    public void addArbitrary(Item item) {
	    items.add(item);
    }
    public double bill(){
    	double a = 0;
    	for( Item s : items ) {
    		a += s.calculatePrice();
    	}
    	return a;
    }


}
