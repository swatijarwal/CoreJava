package basic;

public class DigitReverse {

	public static void main(String[] args) {
int num=9456;
int reverse=0;

while(num!=0)
{
		int r=num%10;
		reverse=reverse*10+r;
		num=num/10;
		
    
	
}

	System.out.println("the reverse of the given numberis."+reverse);

	}
}

