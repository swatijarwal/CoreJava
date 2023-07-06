package rays.inputoutputstream;
import java.io.*;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		
		
		FileReader in= new FileReader("C:\\Users\\hp\\Desktop\\io\\next.txt ");
		
		
        int ch=in.read();
        while(ch!=-1)
        {
        	System.out.println((char)ch);
        	ch=in.read();
        }
		 in.close();
	}

}
