package rays.inputoutputstream;

import java.io.*;

public class ReadByKeyboard {

	public static void main(String[] args) throws Exception {

		InputStreamReader isReader = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isReader);

		FileWriter f = new FileWriter("C:\\Users\\hp\\Desktop\\io\\gdc.txt ");

		PrintWriter pw = new PrintWriter(f);

		String line = br.readLine();

		while (!(line.equals("quit"))) {

			pw.println(line);

			line = br.readLine();
		}

		isReader.close();
		br.close();
		f.close();
		pw.close();

	}

}
