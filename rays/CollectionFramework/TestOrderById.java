package rays.CollectionFramework;

import java.util.*;

public class TestOrderById {

	public static void main(String[] args) {
	     
		 List list=new ArrayList();
         list.add(new Markseet(2,"b","indore"));
         list.add(new Markseet(1,"a","ujjain"));
         list.add(new Markseet(2,"d","bhopal"));
         list.add(new Markseet(3,"c","dewas"));
         Collections.sort(list, new OrderById());
         
         for (Object object : list) {
        	 System.out.println(object);
			
		}
         
	}



	
}
