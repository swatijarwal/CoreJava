package Exercise;

public class SumAllNum {

	public static void main(String[] args) {
		int n=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				n=n+i;
				System.out.println(i);
			}
			//System.out.println("sum of all integer =" + n);	
		}System.out.println("sum of all integer =" + n);	

	}

}
