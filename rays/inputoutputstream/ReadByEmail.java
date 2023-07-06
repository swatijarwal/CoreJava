package rays.inputoutputstream;
import java.io.*;

public class ReadByEmail {

	public static void main(String[] args) throws Exception {
	   FileReader file= new FileReader("C:\\Users\\hp\\Desktop\\io\\gmail.txt");
	    BufferedReader in= new BufferedReader(file);
	    String line =in.readLine();
	    while(line!=null)
	    {
	    	System.out.println(line);
	    	line=in.readLine();
	    }
	    
	   
	   
	}

}
