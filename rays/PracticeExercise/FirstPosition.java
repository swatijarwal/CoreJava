package rays.PracticeExercise;
import java.util.*;

public class FirstPosition {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(list);
		list.add(0, 4);
		System.out.println(list);
		System.out.println(list.get(2));
	    System.out.println(list.remove(2));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

	}

}
