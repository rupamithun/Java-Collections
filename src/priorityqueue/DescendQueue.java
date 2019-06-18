package priorityqueue;

import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DescendQueue {

	public static void main(String[] args) {
PriorityQueue pqr=new PriorityQueue<String>(new comparator());
pqr.add("G");
pqr.add("T");
pqr.add("A");
pqr.add("S");
pqr.add("3");

System.out.println("Before sorting:"+pqr);

System.out.println("After sorting into descending order");

	}
	

}
