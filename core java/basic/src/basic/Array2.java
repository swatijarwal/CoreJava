package basic;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {1,2,3,4,5,6};
        int number=5;
        int index=-1;
        
           for(int i=0;i<arr.length;i++)
           {
        	   if(arr[i]== number)
        	   {
        		   index=i;
        	   }
           }
        
        System.out.println(index);
	}

}
