package org.jonam.emp;
import java.util.Comparator;
public class Employee implements Comparable<Employee>{
	private String lastName;
    private String firstName;
    private String MiddleName;
    private int salary;
      
    public Employee(String lastName, String firstName,String MiddleName, int salary) {
    	this.lastName = lastName;
        this.firstName = firstName;
        this.MiddleName = MiddleName;
        this.salary = salary;
        
    }
    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary; // salary is also positive integer
        }
      
    };
  
    public static final Comparator<Employee> firstNameComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.firstName.compareTo(o2.firstName);
        }
      
    };
    public static final Comparator<Employee> firstNameReverseComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.firstName.compareTo(o1.firstName);
        }
      
    };
  
    public static final Comparator<Employee> lastNameComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.lastName.compareTo(o2.lastName);
        }
      
    };
    public static final Comparator<Employee> MiddleNameComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.MiddleName.compareTo(o2.MiddleName);
        }
      
    };
    

    @Override
    public String toString() {
        return "Employee{" + firstName + " "+  MiddleName +" "+ lastName + ", salary=" + salary +'}';

    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
       
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.MiddleName == null) ? (other.MiddleName != null) : !this.MiddleName.equals(other.MiddleName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        
        hash = 47 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 47 * hash + this.salary;
        hash = 47 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 47 * hash + (this.MiddleName != null ? this.MiddleName.hashCode() : 0);
        
        return hash;
    }


	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


}


