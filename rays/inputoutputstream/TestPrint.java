package rays.inputoutputstream;

import java.io.* ;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrint {

	public static void main(String[] args) throws Exception {
		FileWriter out= new FileWriter("C:\\\\Users\\\\hp\\\\Desktop\\\\io\\\\swati.txt\\", true);
		PrintWriter pw= new PrintWriter(out);
		for(int i=0; i<=5;i++)
		{
			pw.println(i+":core java");
		}	
		      
		
      // pw.close();
       out.close();
       pw.close();
	}

}
