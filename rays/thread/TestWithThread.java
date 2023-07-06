package rays.thread;

public class TestWithThread {

	public static void main(String[] args)  {
		WithThread w1= new WithThread("tommy");
		  //w1.setPriority(1);
		//WithThread w2= new WithThread("jerry");
		//w2.setPriority(10);
		//w1.start();
		//w2.start();
		w1.setDaemon(true);
		w1.start();
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"="+"jerry");
		}
		
		
	
	}

}
