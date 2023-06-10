package Collect;

import java.util.*;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person(1, "abc");
		Person p2 = new Person(2, "def");

		List list1 = new ArrayList();
		list1.add(p1);
		list1.add(p2);
		 
		Iterator it= list1.iterator();
				
			while(it.hasNext())
			{
			   System.out.println(it.next());	
			}
				
	}

}
