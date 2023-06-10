package basic;

public class DecSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] arr= {1,2,40,100,8,1000,999,10};
            int temp=0;
            for(int i=0;arr.length<i;i++)
            	
            {
            	for(int j =i-1;arr.length<j;j--)
            	{
            		if(arr[i]<arr[j])
            		{
            			temp=arr[i];
            			arr[i]=arr[j];
            			arr[i]=temp;
            			
            		}
            	}
            System.out.println(arr[i]);
            }
	}

}
