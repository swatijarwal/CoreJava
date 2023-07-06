package rays.inputoutputstream;
import java.io.*;
import java.util.Scanner;

public class Readbychar {

	public static void main(String[] args) throws Exception {
		FileReader file= new FileReader("C:\\Users\\hp\\Desktop\\io\\a.txt");
		//BufferedReader in= new BufferedReader(file);
		//String line = in.readLine();
		Scanner sc= new Scanner(file);
		while(sc.hasNext())
		{
			System.out.println(sc.next());
			
		}
		

	}

}
