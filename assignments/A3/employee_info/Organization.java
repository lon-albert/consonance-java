package employee_info;

public class Organization {
	
	private String organizationName;
	private Employee[] employees;
	
	public void setOrganizationName(String organizationName){
		this.organizationName = organizationName;
	}
	
	public String getOrganizationName(){
		return organizationName;
	}

	/**
	 * @return the employees
	 */
	public Employee[] getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
}
