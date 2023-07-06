package Exercise;

public class LargestNumber {

	public static void main(String[] args) {
		int[]arr= {1,3,4,6,7,5};
		int b=arr[0];
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]>b)
			b=arr[i];
				
			
		}
        System.out.println("largest num"+ b);
	}

}
