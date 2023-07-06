package rays.inputoutputstream;

import java.io.*;

public class WriteObject {

	public static void main(String[] args) throws Exception {

	 
		FileOutputStream file= new FileOutputStream("C:\\Users\\hp\\Desktop\\io\\ so000.txt");
		ObjectOutputStream obj= new ObjectOutputStream(file);
		Markseet m= new Markseet();
		m.id=1;
		m.name="abc";
		m.physics=88;
		m.maths=90;
		m.chemistry=92;
				
		obj.writeObject(m);		
		
obj.close();
file.close();
	}

}
