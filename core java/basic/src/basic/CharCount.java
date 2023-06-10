package basic;

public class CharCount {

	public static void main(String[] args) {
		String s="swati";
		int count=0;
		for(char c='a';c<='z';c++) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
			//System.out.println(count);
		}
		System.out.println(count);
		count=0;
 
	}
		

}
}