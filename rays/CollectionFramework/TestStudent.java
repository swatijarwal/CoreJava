package rays.CollectionFramework;

import java.util.*;
import java.lang.*;



public class TestStudent {

	public static void main(String[] args) {
	 HashSet set= new HashSet();
	 set.add(new Student (1," swati","indore"));
	 set.add(new Student (1," swati","indore"));
	 set.add(new Student (2," mridula","delhi"));
	 //Collections.sort(set());
	 for (Object object : set) {
		 System.out.println(object);
	}
	 
	 
	 
		
		
		
		
	}

	

}

