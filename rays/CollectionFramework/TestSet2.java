package rays.CollectionFramework;

import java.util.*;

public class TestSet2 {

	public static void main(String[] args) {
  TreeSet ts= new TreeSet();
  ts.add(2);
  ts.add(1);
  ts.add(3);
  ts.add(0);
    Iterator it= ts.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }

	}

}
