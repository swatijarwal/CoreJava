package constructor;

public class Rectangle  {
 private int length;
 private int weigth;
 
  Rectangle()
 {
	 
 }
    Rectangle(int l,int w)
   {
	  length=l;
	  weigth=w;
	  System.out.println(length);
	  System.out.println(weigth);
   }
   
 public void setLength(int length) 
 {
	 this.length=length;
 }
 public int getLength()
 {
	 return length;
 }
  public void setWeigth(int weigth)
  {
	  this.weigth=weigth;
  }
  public int getweigth()
  {
	  return weigth;
  }
 
 
 
}
 