package rays.thread;

public class TestDaemon {

	public static void main(String[] args) {
		Daemon d= new Daemon("daemon");
		d.setDaemon(true);
		d.start();
        for(int i=1; i<=10;i++)
        {   
        	   try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println(i+"="+ "swati");	
        }
	}

}
