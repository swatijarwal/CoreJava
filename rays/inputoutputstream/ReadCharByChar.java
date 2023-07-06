package rays.inputoutputstream;
import java.io.*;

public class ReadCharByChar{


	public static void main(String[] args) throws Exception
	{
		FileReader in=new FileReader("C:\\Users\\hp\\Desktop\\io\\swati.txt");
		int ch= in.read();
		while(ch!=-1)
		{
			System.out.println((char)ch);
			ch=in.read();
		}

	}

}