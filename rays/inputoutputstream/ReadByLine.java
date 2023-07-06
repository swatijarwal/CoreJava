package rays.inputoutputstream;

import java.io.*;

public class ReadByLine {

	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("C:\\Users\\hp\\Desktop\\io\\swati.txt");
		BufferedReader in= new BufferedReader(file);
		String Line= in.readLine();
		while(Line!=null)
		{
			System.out.println(Line);
			Line=in.readLine();
		}

	}

}
