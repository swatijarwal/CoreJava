package basic;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={1,2,3,6,5,4,};
		int a=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		  if(arr[i]>a)
		  {
			a=arr[i];  
		  }
		}
		  System.out.println("largest num="+a);
		
		

	}

}
