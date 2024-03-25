package firstSemesterAssignments;



public class Factory {
	
	//Alp Biricik 150122046
	/*This class has everything about the factory it 
	 * sets the item price, capacity of the storage.
	 * Operates adding or removing employees... */
	
	int x = 0 ;
	int v = 0 ;

	private String name;
	private Employee[] employees = new Employee[1];
	private Storage storage;
	private Payroll[] payrolls = new Payroll[1];
	private double itemPrice;
	
      
      Factory(String name , int capacity , double itemPrice){
    	  this.itemPrice = itemPrice;
    	  this.name = name;
    	  
    	  this.storage =new Storage(capacity);
    	  
       
      }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public Payroll[] getPayrolls() {
		return payrolls;
	}
	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	double getRevenue() {
    	 return (double) (Item.numberOfItems * itemPrice);
      }
      double getPaidSalaries() {
    	  double a  = 0 ;
    	  for(int k = 0 ; k < payrolls.length ; k++) {
    		  if(payrolls[k] == null)
    			  continue;
    		 a += payrolls[k].calculateSalary();
    	  }
    	  return a ;
    	  
      }
   
      void addEmployee(Employee employee) {
    	  employees[x] = employee;
    	  resizeForAdd(employees,x+2);
    	  employee.startShift();
    	  for(int z = 0 ; z<employee.getItems().length ; z++)
    	  storage.addItem(employee.getItems()[z]);
    	  x++;
      }
      
      public  void resizeForAdd(Employee[] arr , int newCapacity ) {
		  arr = new Employee[newCapacity];
		  for(int k =0 ; k < employees.length; k++) {
			  arr[k] = employees[k];
		  }
		  employees = arr;
	}
      public  void resizeForRemove(Employee[] arr, int newCapacity, Employee removedOne) {
    	  arr = new Employee[newCapacity];
    	  for(int j = 0,  k = 0 ; k < employees.length; j++, k++) {
    		  if(employees[k] == removedOne) {
    			  arr[j] = employees[k+1];
    			  k++;
    		  }
    		  else
    			  arr[j] = employees[k];
    	  }
    	  employees = new Employee[arr.length];
    	  for(int j = 0 ; j < arr.length ; j++) {
    	  employees[j] = arr[j] ;
    	  }
    	  
    	  
      }
      
      Employee removeEmployee(int id) {
    	  
    	      int a = 0;
    		  int k = 0;
    		  int b = 0 ;
    	  for( k = 0 ; k < employees.length; k++) {
    		  if(employees[k] != null) {
    			  a++; break;
    			  }
    		  else if(employees[k] == null )
    			  b++;
    		  if(b == employees.length)
    			  System.out.println("There are no employees");
    	  }
    	  if (a == 1)
    		  k++;
    		  
    	  if(employees[k-1] == null && k == employees.length) {
    		  return null;
    	  }
    	 
    	  else {
    	  
    	  int z = 0;
    	  boolean h = true;
    	  
    	 for( k = 0 ; k< employees.length ; k++) {
    		 if(employees[k] == null) {
    			 continue;
    		 }
    		if(employees[k].getId() == id) {
    			z = k;
    			h = false;
    			    break;
    		    }
    		
    	 }
          if(h) 
 			System.out.println("Employee does not exist.");	
          
    	Employee removedOne = employees[z]; 
        
    	resizeForRemove(employees,employees.length-1,removedOne);
    	 removedOne.endShift();
    	 addPayroll(removedOne.getPayroll());
    	 
    	 return removedOne;
    	  }
      }
      private void addPayroll(Payroll payroll) {
    	  payrolls[v] = payroll;
    	  resizeForPayroll(payrolls , v+2);
    	  v++;
      }
      public void resizeForPayroll(Payroll[] arr , int newCapacity) {
    	  arr = new Payroll[newCapacity];
		  for(int k =0 ; k < payrolls.length; k++) {
			  arr[k] = payrolls[k];
		  }
		  payrolls = arr;
      }
}
