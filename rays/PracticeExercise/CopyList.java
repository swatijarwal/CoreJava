package rays.PracticeExercise;
import java.util.*;

public class CopyList {

	public static void main(String[] args) {
	  ArrayList list= new ArrayList();
	  list.add("1");
	  list.add("2");
	  list.add("3");
	  list.add("4");
	  list.add("5");
	System.out.println(list);
	  ArrayList list2=new ArrayList();
	  list2.add("a");
	  list2.add("b");
	  list2.add("c");
	  list2.add("d");
	  list2.add("e");
	  
	 System.out.println(list2);
	  Collections.copy(list, list2);
	  System.out.println("list:"+list);
	  System.out.println("list2:"+list2);
	  
	  


		

	}

}
