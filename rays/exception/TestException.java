package rays.exception;

public class TestException{

	public static void main(String[] args)  {
	 
		try {
			  String name= "admi";
			  if(name.equals("admin"))
			  {
				 System.out.println("valid user");  
			  }
			  else
			  {
				    throw new LoginException();
			  }   
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
