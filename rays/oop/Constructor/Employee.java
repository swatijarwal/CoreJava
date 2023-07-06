package rays.oop.Constructor;

public class Employee extends Person {
	


	private String department;
	
	Employee(int id,String name, String address,String department)
	{
	    super(id,name,address);
	
	  this.department=department;
	}

     public void getDepartment()
     {
    	 System.out.println(department);
}    
}