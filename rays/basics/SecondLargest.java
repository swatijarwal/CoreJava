package rays.basics;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,4,5,6};
		int a=0;
		int b=arr[0];
		for(int i=0; i<arr.length;i++)
		{  
			if(arr[i]>b) {
				
			a=b;
			b=arr[i];
			
		}
		
	
	}
        System.out.println(a);
}
}