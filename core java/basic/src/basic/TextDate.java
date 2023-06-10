package basic;

import java.util.Date;
import java.text.*;
public class TextDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date today=new Date();
        
        System.out.println(today);
      SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
      String s= sdf.format(today);
      System.out.println(s);
	}

}
