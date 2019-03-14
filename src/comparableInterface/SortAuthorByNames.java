package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAuthorByNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Author> al=new ArrayList<Author>();
al.add(new Author("Henry","Miller", "Tropic of Cancer"));  
al.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
al.add(new Author("Frank","Miller", "300"));
al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));

Collections.sort(al);
for(Author str:al)
{
	System.out.println(str.firstname+" "+
	          str.lastname+" "+"Book: "+str.bookname);
 
}

	}

}
