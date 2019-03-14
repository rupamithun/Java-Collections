package comparatorInterface;

import java.util.Comparator;

public class BookComparator implements Comparator<Author> {
	
	public int compare(Author a1,Author a2)
	{
		return a1.BookName.compareTo(a2.BookName);
	}
	
	

}
