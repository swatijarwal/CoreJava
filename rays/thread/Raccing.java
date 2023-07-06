package rays.thread;

public class Raccing  extends Thread{
	private String name;
	public static Account account= new Account();
	
	
	public  Raccing(String name)
	{
		this.name=name;
	}
	public void run() {
		 for (int i=1;i<=5;i++)
		 {
			 account.deposit(name, 1000);
		 }
	}

}
