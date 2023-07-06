package rays.failFastSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFialFast {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("one");
		list.add(2);
		list.add("two");
		Iterator it = list.iterator();
		//list.add(10);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
