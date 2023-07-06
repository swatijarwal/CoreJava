package rays.inputoutputstream;
import java.io.*;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) throws Exception {
		FileReader in= new FileReader("C:\\Users\\hp\\Desktop\\io\\next.txt ");
		Scanner sc= new Scanner(in);
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
	
	      in.close();
	      sc.close();
	}
	
}
