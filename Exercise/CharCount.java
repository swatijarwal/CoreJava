package Exercise;

public class CharCount {
	public static void main(String[] args) {
		String s="swati";
		int count=0;
		for(int c='a';c<='z'; c++)
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
