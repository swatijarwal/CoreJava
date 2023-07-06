package rays.inputoutputstream;

import java.io.*;

public class BinaryFile {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\01d90d46a5153b718c4301dbc889d530.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\hp\\Desktop\\io\\rays.jpg");
		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch = in.read();

		}
		in.close();
		out.close();
	}

}
