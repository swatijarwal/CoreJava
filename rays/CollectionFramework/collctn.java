package rays.CollectionFramework;

import java.util.*;

public class collctn {
	public static void main(String[] args) {
		
		Collection list1 = new ArrayList();
		Collection list2= new ArrayList();
		
         list1.add("abc");
         System.out.println(list1);
          list2.add("def");
          System.out.println(list2);
          list1.addAll(list2);
          System.out.println(list1);
         // list1.clear();
        //  System.out.println(list1);
        // list1.contains(list2) ;
          list1.size();
          System.out.println("size of list1="+list1.size());
          // list1.remove("abc");
          // System.out.println(list1);
          // list1.removeAll(list2);
          // System.out.println(list1);
          list1.isEmpty();
          System.out.println(list1);
          
          System.out.println(list1.contains("abc"));
         // list1.retainAll(list1);
          System.out.println(list1.retainAll(list2));
          
          
        // System.out.println(list1.r);
		
		
	}

}
