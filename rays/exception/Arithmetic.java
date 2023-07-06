package rays.exception;

public class Arithmetic {

	public static void main(String[] args) {
		try {
			
			String name="name";
			System.out.println( "name is="+"swati");
			
			int a=10;
			int b=0;
			 int c= a/b;
	
			 System.out.print( c);
			
		} catch (Exception e) {
			System.out.println(" this is catch block");
		}
          int a=10;
          int b=2;
          int c=a+b;
          System.out.println("add is="+c);
	}

}
