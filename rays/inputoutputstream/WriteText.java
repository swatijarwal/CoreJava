package rays.inputoutputstream;
import java.io.*;
import java.io.Writer;

public class WriteText {

	public static void main(String[] args) throws Exception {
		FileWriter out= new FileWriter("C:\\Users\\hp\\Desktop\\io\\abc.txt ");
		out.write("swati");
		out.write("\n");
		out.write("jarwal");
		
	  out.close();
     
	}
      
}
