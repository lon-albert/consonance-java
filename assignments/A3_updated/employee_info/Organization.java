package employee_info;

import java.util.ArrayList;

public class Organization {
	
	private String organizationName;	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Organization(String name, ArrayList<Employee> employee){
		this.organizationName = name;
		this.employees = employee;
	}
	
	public Organization(){}
	
	public void setOrganizationName(String name){
		this.organizationName = name;
	}
	
	public String getOrganizationName(){
		return organizationName;
	}

	/**
	 * @return the employees
	 */
	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	/*
	 * Adds an employee object to an organization
	 * */
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public boolean isSameOrganization(Organization a, Organization b){
		if (a.organizationName.equals(b.organizationName))
			return true;
		return false;
	}
	
	public String toString(){
		String output = "Welcome to " + this.organizationName;
		return output;
	}
	
}
