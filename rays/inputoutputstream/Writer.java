package rays.inputoutputstream;

import java.io.*;

import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws Exception {
	FileWriter out= new FileWriter("C:\\\\Users\\\\hp\\\\Desktop\\\\io\\\\swati.txt\\", true);
     out.write(" how are you");
     out.close();
	}

}
