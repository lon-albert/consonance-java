package employee_info;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
	
	private String name;
	private char sex;
	private Date dob;
	
	public Person() {}
	
	public Person(String name, char sex, String birthday) throws ParseException{
		this.name = name;
		this.sex = sex;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		this.dob = formatter.parse(birthday);
	}

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
	
	public Date getBirthday() {
		return dob;
	}

	public void setBirthday(String dob) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		this.dob = formatter.parse(dob);
	}

	public String toString(){
		String output = "I am " + name;
		return output;
	}
}
