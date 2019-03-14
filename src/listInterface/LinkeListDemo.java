package listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkeListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("item1");
		llist.add("item2");
		llist.add("item3");
		llist.add("item4");
		
		System.out.println("Contents of LinkedList:" +llist);
		
		llist.add(0,"First Item");
		llist.add(5,"Last Item");
		System.out.println("After add()" +llist);
		
		llist.remove(1);
		System.out.println("after remove" +llist);
		
		int x=llist.indexOf("item2");
		System.out.println("x="+x);
		
		ArrayList<String> arrlist=new ArrayList<String>(Arrays.asList("1","2","3"));
		llist.addAll(arrlist);
		for(String temp:llist)
		System.out.println(temp);
		
		//List iterator is used for traversing the elements in both forward and backward direction
		
		ListIterator<String> itlist=llist.listIterator();
		System.out.println("List Iterator in forward direct");
		while(itlist.hasNext())
		{
			System.out.println(itlist.next());
		}
		
System.out.println("listIterator in backward direction");
while(itlist.hasPrevious())
{
	System.out.println(itlist.previous());
}
		//DESCENDING
Iterator<String> itt=llist.descendingIterator();

		

	}

}
