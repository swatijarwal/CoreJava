package rays.External;

import  java.io.*;

public class Employee implements Externalizable {
	
	public int id;
	public String  firstName;
	public String lastName;
	public int salary;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	   out.writeObject(id);
	   out.writeObject(firstName);
	   out.writeObject(lastName);
	   out.writeObject(salary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id= (int) in.readObject();
		firstName= (String) in.readObject();
		 lastName  =  (String) in.readObject();
		salary= (int) in.readObject();
	}
	
	

}
