package employee_info;

public class Employee extends Person{
	
	private String job;
	private Organization organization;
	
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
	
	public String toString(){
		return "";
	}
}
