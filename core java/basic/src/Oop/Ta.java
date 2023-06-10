package Oop;

public class Ta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ac a=new Ac();
       // a.setNumber(swati1233);
       // System.out.print(a.getNumber());
       
        a.setNumber("sbi234566");
	System.out.println(a.getNumber());
      a.setAccoutType("saving");
      System.out.println(a.getAccoutType());
     System.out.println(a.getBalance());
     a.setBalance(200);
     System.out.println(a.getBalance());
     a.Deposit(2000);
     a.Withdrwal(1500);
	}
}
