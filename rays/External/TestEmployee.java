package rays.External;

import java.io.*;

public class TestEmployee {

	public static void main(String[] args) throws Exception  {
		
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\io\\ Employee.txt");
		ObjectInputStream in= new ObjectInputStream(file);
		Employee e= (Employee) in.readObject();
		System.out.println(e.id);
		System.out.println(e.firstName);
		System.out.println(e.lastName);
		System.out.println(e.salary);
		
	      
		//file.close();
		in.close();
		file.close();

	}

}
