package rays.exception;
import java.util.*;
public class TryCatchFinally2 {

	public static void main(String[] args) {
		try {
			
			  String s1= "core";
			  String s2= "java";
			  String s3= s1.concat(s2);
			  System.out.println(s3);
			  
			   System.exit(0);
			
			
			
			
		} finally {
		       System.out.println("not equal");
		}

	}

}
