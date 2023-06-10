package Oop.Practice;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book("JAVA","James","sbin0011");
	    Book b2=new Book("c","Denish","234ee");
	    Book.add_Book(b1);
	    Book.add_Book(b2);
	    ArrayList<Book>bookcollection=Book.getBookCollection();
	    
	    
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getISBN());
		 
		
		 
		 
		 
		 
		

	}

}
