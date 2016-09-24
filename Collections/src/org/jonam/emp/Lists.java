package org.jonam.emp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Shukla","Rahul","Kumar", 60000);
		Employee e2 = new Employee("Rehman","Wasi","Ur", 50000);
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		Collections.sort(emp); 
		Collections.sort(emp, Employee.SalaryComparator);
		System.out.println(emp);
		Collections.sort(emp, Employee.firstNameComparator);
		System.out.println(emp);
		Collections.sort(emp, Employee.firstNameReverseComparator);
		System.out.println(emp);
		
	}
	
}