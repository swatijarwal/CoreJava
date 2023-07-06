package rays.PracticeExercise;

public class armStrong {
	public static void main(String[] args) {
		int num=5;
		int r=0;
		int sum=0;
		if(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
			
		}
		System.out.println(sum);
	}
	

}
