package basic;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=2;
      int r;
      int sum=0;
      while(n>0)
      {
    	  r=n%10;
    	  sum=sum+(r*r*r);
    	  n=n/10;
      }
	
	System.out.println(sum);
	}
}
