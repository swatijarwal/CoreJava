package exception;

public class TestFamillyPropagation {

	public static void main(String[] args) {
		dad();


	}

	private static void dad() {
		System.out.println(1);
		try {
			mom();
			
		} catch (Exception e) {
			System.out.println("family");
			e.printStackTrace();
		}
		//System.out.println("dad");
		
	}

	private static void mom() throws Exception {
       //son();
       System.out.println(2);
       son();
		
	}

	private static void son() throws Exception {
		System.out.println(3);
		throw new Exception();
		
	}

}
