package rays.inputoutputstream;
import java.io.*;

public class DataLineByLine {

	public static void main(String[] args) throws Exception {
	FileWriter fw= new FileWriter("C:\\Users\\hp\\Desktop\\io\\abc.txt ");
	PrintWriter pw= new PrintWriter(fw);
    for(int i=0; i<5; i++)
    {
    	pw.print(i+"= Line");
    }
        fw.close();
        pw.close();
	}

}
