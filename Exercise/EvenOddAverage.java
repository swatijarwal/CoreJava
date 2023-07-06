package Exercise;

public class EvenOddAverage {

	public static void main(String[] args) {
	  int sum1=0;
	  int sum2=0;
	  for(int i=1;i<=50; i= i+2)
		  
	  { 
		  sum1= sum1+i;
	  }  
		  System.out.println("sum of odd="+ sum1);
		  
		  
		  
	  
	  for(int j=2;j<=50; j=j+2)
	  {
		  sum2=sum2+j;
	  }  
		  System.out.println("sum of even=" +sum2);
		  
	  
	      int average= (sum1+sum2)/2;
	      System.out.println("sum of average="+ average);
	  	  

	}

}
