package rays.PracticeExercise;

import java.util.*;

public class Employee1  {
	
	 public int id;
     public	int salary;
	 public String  firstName;
	 public String lastName;
	public     String address;
	
	public Employee1( int id,int salary,String firstName, String lastName,String address)
	{
		this.id=id;
		this.salary=salary;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
	}
     @Override
    public String toString() {
    	
    	return id+" "+ salary+ " "+firstName+" "+lastName+" " +address;
    }
}
      class OrderBySalary implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		return o2.salary-o1.salary;
	}
	} 

