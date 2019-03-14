package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Author> al=new ArrayList<Author>();
		al.add(new Author("Henry", "Tropic of Cancer",  45));
	     al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Author("Frank", "300", 65));
	     al.add(new Author("Deborah", "Sky Boys", 51));
	     al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	     System.out.println("First name sorting");
	     Collections.sort(al);
	     for(Author Au: al) {
	    	 System.out.println(Au.FirstName); 
	     }
	     System.out.println("Bookname sorting");
	     Collections.sort(al,new BookComparator());
	     for(Author Au:al)
	     {
	    	 System.out.println(Au.BookName);
	     }
	    	
	     System.out.println("age");
	     Collections.sort(al, new AgeComparator());
	     for(Author Au:al)
	     {
	    	 System.out.println(Au.auage);
	     }
	    		 }

}
