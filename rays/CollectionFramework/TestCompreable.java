package rays.CollectionFramework;

import java.util.*;


public class TestCompreable {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Markseet(2,"b","indore"));
		list.add(new Markseet(3,"c","bhopal"));
		list.add(new Markseet(4,"d","delhi"));
		list.add(new Markseet(1,"a","ujjain"));
		
         Collections.sort(list);
        Iterator it=   list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
