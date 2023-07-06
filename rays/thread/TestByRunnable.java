package rays.thread;

public class TestByRunnable {

	public static void main(String[] args) {
		ByRunnable b1= new ByRunnable("rays");
		ByRunnable b2= new ByRunnable("coaching");
	     Thread t1= new Thread(new ByRunnable("rays"));
	     Thread t2= new Thread(b2);
	     t1.start();
	    t2.start();
	     
	   

	}

}
