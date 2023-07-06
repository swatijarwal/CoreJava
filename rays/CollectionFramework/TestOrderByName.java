package rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrderByName {

	public static void main(String[] args) {
		 List list=new ArrayList();
         list.add(new Markseet(2,"b","indore"));
         list.add(new Markseet(1,"a","ujjain"));
         list.add(new Markseet(4,"a","bhopal"));
         list.add(new Markseet(3,"c","dewas"));
         Collections.sort(list, new OrderByName());
         for (Object object : list) {
        	 System.out.println(object);
         }

	}

}
