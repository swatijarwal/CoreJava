package basic;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int[]num= {122,212,35,48,56,70};
		int n=212;
		int index=-1;
		for(int i=1;i<num.length;i++)
		{
			if(num[i]==n) {
				index=i;
			}
		}
		System.out.println(index);
	}    

}
