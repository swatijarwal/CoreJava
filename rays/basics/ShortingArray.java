package rays.basics;

public class ShortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,33,4 ,11,55,66};
		int a=arr[0];
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]<a)
			{
				a=arr[i];
			}
		}
		System.out.println("sorting of num="+a);

	}

}
