package rays.PracticeExercise;
import java.lang.*;
import java.util.LinkedList;
public class TestLinked {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.addFirst(1);
		System.out.println(list);
		list.addLast(5);
		System.out.println(list);
		//middle pass
		list.add(3, 4);
		System.out.println(list);
		

	}

}
