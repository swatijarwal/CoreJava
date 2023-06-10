package basic;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=2345;
    int r=0 ;
    while(n!=0)
    {
    	 int s=n%10;
    	r=r*10+s;
    	n=n/10;
    	
    	
    }// System.out.println(n);
	
 System.out.println("digit reverse"+r);

}
}