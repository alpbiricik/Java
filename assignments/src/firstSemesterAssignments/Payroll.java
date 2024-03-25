package firstSemesterAssignments;

public class Payroll {
	//Alp Biricik 150122046
	/*This class prepares payrolls of 
	 * the employees work in this factory.*/
	private int workHour;
	private int itemCount;
	
	Payroll(int workHour, int itemCount){
		this.itemCount = itemCount;
		this.workHour = workHour;
	}
	 int calculateSalary() {
		return ((workHour * 30) + (itemCount * 20));
	}
     public String toString() {
	return ("The work hour is " + workHour + " and the proceed "
			+ "item count is " +itemCount + ".");
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

}
