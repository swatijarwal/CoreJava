package rays.PracticeExercise;

public class testCloningAccount {

	public static void main(String[] args) {
	    
	  ClonlingAccount c= new ClonlingAccount();
	  c.setBalance(100);
	  	ClonlingAccount c1= (c);
	  	c1.setBalance(200);
    System.out.println(c.getBalance());
    System.out.println(c1.getBalance());
	   

	}

}
