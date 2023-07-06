package rays.basics;

import java.util.*;
import java.text.*;
public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String src ="29/05/2023";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d=sdf.parse(src);
		System.out.println(src);
		

	}

}
