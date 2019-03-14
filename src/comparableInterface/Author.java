package comparableInterface;

public class Author implements Comparable<Author>{
	
String firstname;
String lastname;
String bookname;
public  Author(String first,String las,String book)
{
	this.firstname=first;
	this.lastname=las;
	this.bookname=book;
	
}
public int compareTo(Author Au)
{
	int last=this.lastname.compareTo(Au.lastname);
	return last==0?this.firstname.compareTo(Au.firstname):last;
}
}
