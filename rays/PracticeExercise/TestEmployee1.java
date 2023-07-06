package rays.PracticeExercise;
import java.util.*;

public class TestEmployee1 {
	public static void main(String[] args) {
		
	
	List list=new ArrayList();
	list.add(new Employee1(104 ,5000, "swati","patel", " indore"));
	list.add(new Employee1(301, 3000,"archna","meena"," jabalpur"));
	list.add(new Employee1(102, 4000, "khushi","gurjar","ujjain"));
	list.add(new Employee1(104,2000,"swati","jarwal" ,"indore"));

	
 Collections.sort(list, new FirstNameSorting());
	
	 Iterator it=list.listIterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	
	

}
}