package rays.inputoutputstream;
import java.io.*;

public class LineByLineRead {

	public static void main(String[] args)  throws Exception{
		FileReader file= new FileReader("C:\\Users\\hp\\Desktop\\io\\next.txt ");
		BufferedReader br= new BufferedReader(file);
		String line= br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			 line= br.readLine();
		}
		
         file.close();
         br.close();
	}

}
