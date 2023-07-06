package rays.failFastSafe;
import java.util.*;

public class TestFailSafe {

	public static void main(String[] args) {
		Vector vc= new Vector();
		vc.add(100);
		vc.add("swati");
		vc.add(200);
		vc.add("jarwal ");
		Enumeration e=  vc.elements();
		vc.add(300);
		 
		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
		 }

	}

}
