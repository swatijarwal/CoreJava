package Polymorphism;

public class TextShap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
        //  Shape s= new Shape(3);
          
          Shape[] s= new Shape[3];
          s[0]= new Rectangle();
          s[1]= new Triangle();
          s[2]= new circle();
            
          Rectangle r=(Rectangle) s[0];
          r.setLength(10);
          r.setWiegth(20);
          
           Triangle t= (Triangle) s[1];
           t.setBase(20);
           t.setHeight(30);
           
          circle c=(circle) s[2];
          c.setRadius(10);
          
          
              double totalArea=0;
             for(int i=0; i<s.length;i++)
             {
            	  s[i].area();
            	totalArea += s[i].area(); 
            	  
             }
        
            System.out.println("Total area"+ totalArea);
          
          
          
	}

}
