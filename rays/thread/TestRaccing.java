package rays.thread;

public class TestRaccing {

	public static void main(String[] args) {
		Raccing t1= new Raccing("swati");
		Raccing t2= new Raccing("tommy");
		t1.start();
		t2.start();
		
	  

}
}