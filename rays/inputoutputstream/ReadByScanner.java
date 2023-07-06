package rays.inputoutputstream;

import java.io.*;
import java.util.*;

public class ReadByScanner {

	public static void main(String[] args) throws Exception {
		FileReader in =new FileReader("C:\\Users\\hp\\Desktop\\io\\swati.txt");
		Scanner sc= new Scanner(in);
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
         in.close();
         sc.close();
	}

}
