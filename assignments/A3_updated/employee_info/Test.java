package employee_info;

import java.text.ParseException;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws ParseException{
		
		Person a = new Person();
		a.setName("Shade");
		a.setSex('F');
		a.setBirthday("19/11/1995");
		
		Person b = new Person("Tayo", 'M', "7/3/1986");
		
		Person c = new Person("Damilola", 'M', "5/12/1996");
		
		Person d = new Person("Tobi", 'F', "6/2/1977");
		
		Person e = new Person("Shola", 'M', "3/10/1992");
		
		Person f = new Person("Cynthia", 'F', "4/7/1990");
		
		Organization google = new Organization();
		google.setOrganizationName("Google");
		
		Organization microsoft = new Organization();
		microsoft.setOrganizationName("Microsoft");
		
		Employee first = new Employee();
		first.setName("Connor");
		first.setSex('M');
		first.setBirthday("19/11/1995");
		first.setJob("Manager");
		
		Employee second = new Employee("Titi", 'M', "5/4/1982", "Manager", microsoft);
		Employee third = new Employee("Emmanuel", 'M', "10/08/1975", "Staff", google);
		Employee fourth = new Employee("Clinton", 'M', "25/4/1986", "Staff", microsoft);
		Employee fifth = new Employee("Blessing", 'F', "31/10/1989", "PA", google);
		Employee sixth = new Employee("John", 'M', "07/12/1981", "PA", microsoft);
		Employee seventh = new Employee("Mavin", 'M', "5/4/1982", "Staff", google);
		Employee eighth = new Employee("Olivia", 'F', "06/08/1990", "Staff", microsoft);
		Employee ninth = new Employee("Blessing", 'F', "31/10/1989", "Staff", google);
		Employee tenth = new Employee("Lucinda", 'F', "15/4/1982", "Staff", microsoft);
		
		Employee eleventh = new Employee();
		eleventh.setName("Daniel");
		eleventh.setSex('M');
		eleventh.setBirthday("2/5/1990");
		eleventh.setJob("Staff");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(eleventh);
		employees.add(first);
		
		google.setEmployees(employees);
		
		
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
		System.out.println(sixth.toString());
		System.out.println(eighth.toString());
		System.out.println(tenth.toString());
		System.out.println(fifth.isSamePerson(ninth));
		System.out.println(fourth.isSamePerson(seventh));
	}
}