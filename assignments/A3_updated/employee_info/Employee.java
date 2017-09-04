package employee_info;

import java.text.ParseException;

public class Employee extends Person{
	
	private String job;
	private Organization organization;
	
	public Employee(String name, char sex, String birthday, String job, Organization organization) throws ParseException{
		super(name, sex, birthday);
		this.job = job;
		this.organization = organization;
	}
	
	public Employee(){}
	
	public void setJob(String job){
		this.job = job;
	}
	
	public String getJob(){
		return job;
	}
	
	public void setOrganization(Organization organization){
		this.organization = organization;
	}
	
	public Organization getOrganization(){
		return organization;
	}
	
	public boolean isSamePerson(Employee a, Employee b){
		boolean condition = (a.getName().equals(b.getName())) 
				&& (a.getSex() == b.getSex()) 
				&& (a.getBirthday().equals(b.getBirthday())) 
				&& (a.organization.equals(b.organization));
		
		if(condition)
			return true;
		return false;
	}
	
	public boolean isSamePerson(Employee a){
		boolean condition = (this.getName().equals(a.getName())) 
				&& (this.getSex() == a.getSex()) 
				&& (this.getBirthday().equals(a.getBirthday())) 
				&& (this.organization.equals(a.organization));
		
		if(condition)
			return true;
		return false;
	}
	
	public String toString(){
		String output = "I am " + this.getName() + " an employee of " + this.organization;
		return output;
	}
}
