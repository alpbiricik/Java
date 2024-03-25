package firstSemesterAssignments;

public class Employee {
	//Alp Biricik 150122046
	// This class keeps the informations about the employees works in this factory 
	 
	
	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items ;
	private Payroll payroll;
	
     
	Employee(int id , String name , String surname, int workHour, int speed ){
		this.workHour = workHour;
		this.surname = surname;
		this.speed = speed;
        this.name = name;
        this.id = id ;
	}
	 Item[] startShift() {
		 int itemCount = speed * workHour;
		 items= new Item[itemCount];
		for( int k = 0 ; k< itemCount ; k++) {
			int newItems = (int) (Math.random() * 100 + 1);
			items[k] = new Item(newItems);
		}
		return items;
	}
	 Payroll endShift() {
			payroll = new Payroll (workHour,items.length);
			return payroll;
		}
		public String toString() {
			 return ( "This is the employee with id "+ id +" speed "+speed + 
					 ". The work hour is " + workHour
			 + " and produced item count is " + (speed*workHour)+ ".");
			
		}
	 public int getId() {
		return id;
	}
	 public void setId(int id) {
		 this.id = id ;
	 }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public Payroll getPayroll() {
		return payroll;
	}
	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	
}
