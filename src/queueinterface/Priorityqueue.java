package queueinterface;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> queue=new PriorityQueue<String>(15,new MyComparator());
queue.add("Tyrion Lannister");
queue.add("Daenerys Targaryen");
queue.add("Arya Stark");
queue.add("Petyr 'Littlefinger' Baelish");
while(queue.size()!=0)
{
	System.out.println(queue.poll());
}

	}

}
