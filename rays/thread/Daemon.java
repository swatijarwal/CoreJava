package rays.thread;

public class Daemon  extends Thread{
	String name= null;
	public Daemon( String name) {
		this.name=name;
		
	}
	public void run()
	{
	    for(int i=1; i<=100;i++)
	    {    
	    	try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(i+"="+ name);
	    }
		
		
	}

}
