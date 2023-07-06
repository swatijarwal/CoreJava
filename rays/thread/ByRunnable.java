package rays.thread;

public class ByRunnable implements Runnable {
	
String name= null;
int i=1;
public ByRunnable(String name)
{
	this.name=name;
}

@Override
public void run() {
	
	   while(true)
	   
	   {
		    try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		   System.out.println(i+"="+ name);
		   i++;
	   }
	
}
	

}
