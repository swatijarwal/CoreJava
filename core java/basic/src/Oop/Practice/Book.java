package Oop.Practice;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	 private static  ArrayList<Book> bookCollection=new ArrayList<Book>();
	 public Book()
	 {
		 
	 }
	public Book(String title,String author,String ISBN)
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
      public String getTitle()
      {
    	  return title;
      }
      public String getAuthor()
      {
    	  return author;
      }
      public String getISBN()
      {
    	  return ISBN;
      }
      public static void add_Book(Book book)
      {
    	  bookCollection.add(book);
    	  
      }
      public static void remove_Book(Book book)
      {
    	  bookCollection.remove(book);
    	  
      }
      public static ArrayList<Book> getBookCollection()
      {
    	  return bookCollection;
      }
	//public void add_Book(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
        
}
