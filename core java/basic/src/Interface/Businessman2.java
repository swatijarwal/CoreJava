package Interface;

public class Businessman2 implements Richman,SocialWorker {
	private String name;
	private String address;
	@Override
	public void helpToOther() {
		System.out.println("Help");
		
	}
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
