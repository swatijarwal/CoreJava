package basic;

public class ArrayMissing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {33,22,11,10,15};
		int[] num= {33,15,11,10};
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<num.length;j++)
			{
				if(arr[i]==num[j])
					
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
