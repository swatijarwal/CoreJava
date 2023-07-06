package rays.PracticeExercise;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet lhs= new LinkedHashSet();

		 lhs.add(1);
		 lhs.add(1);
		 lhs.add(2);
		 lhs.add(4);
		 lhs.add(3);
		 Iterator it= lhs.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 

	}

}
