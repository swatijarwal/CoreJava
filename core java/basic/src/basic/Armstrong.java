package basic;

public class Armstrong {

	public static void main(String[] args) {
		int num=3;
		int r;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
			
		}
           System.out.println(sum);
           
	}

}
