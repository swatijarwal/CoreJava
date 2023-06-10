package basic;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0;
     int b=1;
     int i=0;
     while(i<=10)
     {
    	 System.out.println(a);
    	 i++;
    	 int c=a+b;
    	 a=b;
    	 b=c;
     }
	}

}
