package Oop;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;

	public static final int AVG_AGE = 18;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
     public void setAddress(String address)
     {
    	 this.address=address;
     }
	 public String getAddress()
	 {
		 return address;
	 }
	 
	
	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}
}    
