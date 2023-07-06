package rays.CollectionFramework;
import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		Collection c= new ArrayList();
		c.add("bura mat dekho");// 0index
		c.add("bura mat suno");//1 index
		c.add("bura mt bolo"); //2 index
		System.out.println("length of collection="+c.size());
		
		//print all elements
		for (Object ele:c) 
		{
			System.out.println(ele);
			
		}
		{
			
		}

	}

}
