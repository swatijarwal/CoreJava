package constructor;

public class Person {
	private int id;
	private String name;
	private String address;


 public Person()
 {
	 System.out.println("zero param const"); 
 }
 public Person (int id)
 {
	 this();
	System.out.println("one param const"); 
 }
 public Person(int id,String name)
 {
	 this(id);
	System.out.println("two param const"); 
 }
 public Person(int id,String name,String address )
 {
	 this(id,name);
	 System.out.println("three param const");
 
 
  this .id=id;
  this .name=name;
  this.address=address;
 }
  
   public void  getId()
   {
	   System.out.println(id);
	   
   }
    public void getName()
    {
     System.out.println(name);
  
  
}
 public void getAddress()
 {
	 System.out.println(address);
 }
	  
  

 
  
}  
	  
  
 
	  
 
   
  
 
  
 

  
	  
    
	 
  
  
  
  
