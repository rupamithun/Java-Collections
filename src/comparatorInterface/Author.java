package comparatorInterface;

public class Author implements Comparable<Author>{

	String FirstName;
	String BookName;
	int auage;
	Author(String first, String book, int age){ 
	    this.FirstName = first; 
	    this.BookName = book; 
	    this.auage = age;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getAuage() {
		return auage;
	}
	public void setAuage(int auage) {
		this.auage = auage;
	}
	
	public int compareTo(Author Au)
	{
		return this.FirstName.compareTo(Au.FirstName);
	
	
}
}

