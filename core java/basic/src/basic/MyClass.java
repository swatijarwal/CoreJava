package basic;

public class MyClass {
	

 public int sum(int a,int b)
 {
	int c=a+b;
	System.out.println(c);
        return c;
	}
public void stringBuff(String s) {
		
		StringBuffer sb = new StringBuffer("Swati ");
	sb.append(s);
		System.out.println(sb);

 
	}


 //public void Tringle(int num) {
//}
//}   

	public void Fact(int num) {
		
       
       int sum=1;
       for(int i=1;i<=num;i++) {
    	   sum=sum*i;
       }     
	System.out.println(sum);

	}

	public static void Find(int n) { 
         
		int[]num= {122,212,35,48,56,70};
		
		int index=-1;
		for(int i=1;i<num.length;i++)
		{
			if(num[i]==n) {
				index=i;
			}
		}
		System.out.println(index);
	}  
	public static void DigitReverse(int num){
		
		int reverse=0;

		while(num!=0)
		{
				int r=num%10;
				reverse=reverse*10+r;
				num=num/10;
				
		    
			
		}

			System.out.println("the reverse of the given numberis."+reverse);

			}
}
