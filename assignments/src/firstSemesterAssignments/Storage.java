package firstSemesterAssignments;

public class Storage {
	//Alp Biricik 150122046
	/*This class is the storage of the factory
	 * it keeps items inside of it.*/
	
	private int capacity;
	private Item[] items;
    
    Storage(int capacity){
    	this.capacity = capacity;
    	items = new Item[capacity];
    }
    public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	int y =0;
	void addItem(Item item) {
    	 if(y == capacity) {
    	   resize(items, capacity+1) ;
    	}
    		items[y] = item;
    		y++;
    	
    }
	public  void resize(Item[] arr , int newCapacity ) {
		  arr = new Item[newCapacity];
		  for(int k =0 ; k < items.length; k++) {
			  arr[k] = items[k];
		  }
		  items = arr;
		  this.capacity = newCapacity;
	}
}
