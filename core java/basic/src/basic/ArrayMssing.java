package basic;

public class ArrayMssing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]arr= {1,2,3,4,5,6};
		 int[] arr1= {1,2,3,4,6};
		 int index=-1;
		 int i,j;
		 for( i=0;i<arr.length ;i++)
		 {
			for( j=0; j<arr1.length; j++)
			{
				if(arr[i]==arr1[j])
				{
					index=1;
				}
			}
			if(index==1)
			{
				index=0;
			}
			else
				System.out.println(arr[i]);
		 }

	}

}
