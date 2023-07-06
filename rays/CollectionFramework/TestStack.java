package rays.CollectionFramework;

import java.util.*;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack s= new Stack();
		 s.push(1);
		 s.push(3);
		 s.push(2);
		 s.push(4);
		 System.out.println(s);
		 s.pop();
		 System.out.println(s);
		 s.peek();
		 System.out.println(s);
		 Collections.sort(s);
		 System.out.println(s);
		 s.pop();
		 System.out.println(s);
		 s.peek();
		 System.out.println(s);
		
		
	}

}
