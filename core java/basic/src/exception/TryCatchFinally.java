package exception;

public class TryCatchFinally {
	 public static void main(String[]args)
	 {
		try { 
			 String name="swati";
			 System.out.println("name="+name.charAt(3));
			int k=15;
			int i=0;
			int div=k/i;
			System.out.println("Div of div="+div);
			
			
		}  catch(StringIndexOutOfBoundsException e)
		{
			System.out.println( "BoundException");
		}
		
		catch (ArithmeticException e) {
			System.out.println("by Zero");
		} 
		
			 
		 
		
	 		 
		  
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

}
