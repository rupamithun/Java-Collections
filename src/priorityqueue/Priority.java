package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue<Integer>(16);
		pq.add(4);
		pq.add(5);
		pq.add(1);
		pq.add(9);
		pq.add(0);
		
		Integer head=(int)pq.peek();
		System.out.println("Size of the priority que is "+pq.size());
		System.out.println("Head is "+head);
		
		head=(int)pq.poll();
		head=(int)pq.peek();
		System.out.println("head"+head);
		
		Iterator<Integer> itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
		

	}

}
