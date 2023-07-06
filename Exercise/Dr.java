package Exercise;

public class Dr {

	public static void main(String[] args) 
	{
		String s="vahdam aneem";
		String[] str=s.split(" ");
		int i;
		for(i=0; i<str.length;i++)
		{
			for(int j=str[i].length()-1; j>=0;j--)
			System.out.print(str[i].charAt(j));
		}
		//System.out.println(s.charAt(i));

	}

}
