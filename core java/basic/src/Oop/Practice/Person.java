package Oop.Practice;

public class Person {
	 private String name;
	 private int age;
	 Person()
	 {
		 
	 }
	 Person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
     public void getName()
     {
    	System.out.println(name);
     }
     public void getAge()
     {
    	 System.out.println(age);
     }
}
