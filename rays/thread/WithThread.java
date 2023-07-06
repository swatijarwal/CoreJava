package rays.thread;

public class WithThread extends Thread {
	
	String name=null;
	 int i=1;
public WithThread(String name)
{
	this.name=name;
}
 public void run()
 {
	 
  for(int i=1; i<=10; i++)
  {
	  try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println(i+"="+name);
  }
		
 }

}
