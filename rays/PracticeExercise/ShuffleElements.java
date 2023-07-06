package rays.PracticeExercise;
import java.util.*;

public class ShuffleElements {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(" one");
		list.add(" two");
		list.add(" three");
		list.add(" four");
		//before suffle
		System.out.println(list);
		Collections.shuffle(list);
		
		System.out.println(list);
		

	}

}
