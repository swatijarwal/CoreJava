package Oop;

public class Automobiles {
 private String color;
 private int speed;
 private String make;
public  int greas = 0;
   public void setColor( String color)
   {
	   this.color=color;
   }
    public String getColor()
    {
    	return color;
    } 
     public void setMake(String make)
     {
    	 this. make=make;
     }
        public String getMake()
        {
        	return make;
        }
        
        
        
    
    public void setSpeed(int speed )
    {
    	this.speed=speed;
      System.out.println("you are going"+speed+mph);	
    }
     public int setSpeed()
     {
    	 return speed;
     }
}
    