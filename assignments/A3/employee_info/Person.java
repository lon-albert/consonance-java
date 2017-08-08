package employee_info;

import java.util.Date;

public class Person {
	
	private String name;
	private char sex;
	private Date birthday;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public char getSex(){
		return sex;
	}
	
	public String toString(){
		return "";
	}
}
