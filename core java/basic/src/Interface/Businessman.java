package Interface;

public class Businessman implements Richman {
	
	private String name;
	private String address;
	

	@Override
	public void earnMany() {
	 System.out.println("earnmony");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

}
