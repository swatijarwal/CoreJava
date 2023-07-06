package rays.CollectionFramework;

import java.util.*;

public class Map {

	public static void main(String[] args) {
	    HashMap map= new HashMap();
	    map.put("1", "one");
	    map.put("2", "two");
	    map.put("3", "three");
	    String s=(String) map.get("3");
	    System.out.println(s);
	    map.remove("1");
	    System.out.println(map);
	    map.put("4", "four");
	    System.out.println(map);
	    
			
		}
	   

	}


