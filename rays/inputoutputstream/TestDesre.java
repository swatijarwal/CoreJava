package rays.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDesre  {

	public static void main(String[] args) throws Exception {
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\io\\ so000.txt");
		ObjectInputStream obj= new ObjectInputStream(file);
		   Markseet m= (Markseet) obj.readObject();
		   System.out.println(m.id);
		   System.out.println(m.name);
		   System.out.println(m.physics);
		   System.out.println(m.maths);
		   System.out.println(m.chemistry);
		
		

	}

}
