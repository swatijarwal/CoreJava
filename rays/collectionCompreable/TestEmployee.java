package rays.collectionCompreable;
import java.util.*;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
	 List list= new ArrayList();
	 list.add(new Employee (1,"swati","indore"));
	 list.add(new Employee (2,"maridula","bhopal"));
	 list.add(new Employee (3,"shivanshi","delhi"));
	 list.add(new Employee (4,"ram","ujjain"));
	 list.add(new Employee(1,"sita","pune"));
	 Collections.sort(list);
	 for (Object object : list) {
		System.out.println(object);
	}

	 
	 
	 
	 
	 
		

	}

}
