package rays.PracticeExercise;

import java.util.*;

public class TestMark {

	public static void main(String[] args) {
		List list= new ArrayList();
		list.add(new Mark(2,"b","indore"));
		list.add(new Mark(3,"c","bhopal"));
		list.add(new Mark(1,"a","ujjain"));
		list.add(new Mark(4,"d","pune"));
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
			
		}
				
		

	}

}
