package rays.PracticeExercise;
import java.util.*;
import java.lang.*;



public class Elements {
	public static void main(String[] args) {
		
	

	
	 HashSet s= new HashSet();
	 s.add(1);
	 s.add(2);
	 s.add(3);
	 s.add(4);
	 s.add(7);
	 s.add(7);
	 s.add(5);
	 s.add(8);
	 s.add(9);
	 s.add(10);
	 System.out.println(s);
	
	 TreeSet ts= new TreeSet();
	 ts.add("three");
	 ts.add("two");
	 ts.add("a,one");
	 ts.add("four");
	 ts.add("five");
	// System.out.println(ts);
	  Iterator it= ts.iterator();
	 while(it.hasNext())
	  {
		  String src= (String) it.next();
		  System.out.println(src);
		 System.out.println(it.next());
		  
	  }
	 
	
	 
	 
	 
	}
	

}
