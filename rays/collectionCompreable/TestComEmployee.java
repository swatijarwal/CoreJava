package rays.collectionCompreable;

import java.util.*;

public class TestComEmployee {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(new Employee(3, "swati", "indore"));
		list.add(new Employee(2, "shivanshi", "bhopal"));
		list.add(new Employee(1, "maridula", "delhi"));
		Collections.sort(list, new ComEmployee());

		for (Object object : list) {

			System.out.println(object);

		}

	}

}
