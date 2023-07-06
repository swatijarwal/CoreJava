package Exercise;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int s=121;
		int r;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
					
		}
		if(sum==s)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}
	}

}
