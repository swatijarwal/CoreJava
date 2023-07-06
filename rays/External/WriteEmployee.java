package rays.External;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteEmployee {

	public static void main(String[] args) throws Exception {
		FileOutputStream file= new FileOutputStream("C:\\Users\\hp\\Desktop\\io\\ Employee.txt");
		ObjectOutputStream in=new ObjectOutputStream(file);
		Employee e= new Employee();
		e.id= 234;
		e.firstName="swati";
		e.lastName="jarwal";
		e.salary=2000;
		in.writeObject(e);
		
      // file.close();
       in.close();
       file.close();
	}

}
