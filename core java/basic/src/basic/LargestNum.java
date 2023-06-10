package basic;

public class LargestNum {

	public static void main(String[] args) {
		int[] arr= {23,45,78,44,22};
		int a=arr[0];
		for(int i=0;i<arr.length;i++) {
				
		if(arr[i]>a)
			a=arr[i];
		}	
		System.out.println("largest  num"+a);
			

		

	}

	
}
