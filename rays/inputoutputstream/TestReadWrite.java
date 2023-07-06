package rays.inputoutputstream;
import java.io.*;
import java.util.Scanner;
public class TestReadWrite {

	public static void main(String[] args) throws Exception {
		
		FileReader read= new FileReader("C:\\Users\\hp\\Desktop\\io\\gmail1.txt");
		
		BufferedReader  in = new BufferedReader(read);
		FileWriter write= new FileWriter("C:\\Users\\hp\\Desktop\\io\\ mail.txt");
		
		PrintWriter out= new PrintWriter(write);
		
		String line= in.readLine();
		while(line!=null)
		{
			if(line.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2"))
					{
			    out.print(line);
					
			    line = in.readLine();
					}   
			
			
		}
		
			read.close();
           in.close();
           write.close();
           out.close();
           
           
	}

}

