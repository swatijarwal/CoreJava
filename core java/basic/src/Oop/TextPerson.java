package Oop;
import java.util.*;
import java.text.*;

public class TextPerson {
   
	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
      Person p=new Person();
       p.setName("swati");
       System.out.println(p.getName());
    		 
    // p.AVG_AGE();
      // System.out.println(p.AVG_AGE);
       p.setAddress("A4-bhumi girls hostel");
        System.out.println(p.getAddress());
        
      String src="16/02/2000";
      SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
      Date d=sdf.parse(src);
    	  
      
      System.out.println(d);
     System.out.println(p.AVG_AGE);
       
      
      
}
}