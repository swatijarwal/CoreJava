package rays.exception;

public class TestAajBachGya  {
	public static void main(String[] args) {
		 
		dad();
		
		
	}	

	private static void dad() {
		try {
			mom();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
	}

	private static void mom() throws Exception {
		son();
		
		
	}

	private static void son() throws Exception {
		throw new Exception();
		
		
	}


	 
		 

	

		
		
	}


