package Exercise;

public class Sorting {
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,1};
		int a=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<a)
			{
				a=arr[i];
			}
			
		}
		System.out.println(a);
		
	}

}
