package firstSemesterAssignments;

public class Item {
	//Alp Biricik 150122046
	/*This class keeps the number of items
	 * produced by the employees of this factory.
	 */
	
	private int id;
    static int numberOfItems;
   
	
    Item(int id) {
    	this.id = id ;
		numberOfItems++;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
}
