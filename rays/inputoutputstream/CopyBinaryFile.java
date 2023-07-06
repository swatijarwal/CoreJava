package rays.inputoutputstream;

import java.io.*;

public class CopyBinaryFile {

	public static void main(String[] args) throws Exception {
	   String Source="email.txt";
	   String target="next.txt ";
	   FileReader in= new FileReader(Source);
	   FileReader out= new FileReader(target);
	   int  ch=in.read();
	   while(ch!=-1)
	   {
		  
		   
		   
	   }
	    out.close();
	    in.close();
	    System.out.println(Source + " is copied to" +target);

	}

}
