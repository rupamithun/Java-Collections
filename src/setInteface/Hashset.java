package setInteface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(400);
		hset.add(200);
		hset.add(100);
		hset.add(300);//doesnot allow duplicate values
		
		for(int temp:hset)
		{
			System.out.println(temp);
		}
		System.out.println("TREE SET");
		
		Set<Integer> set=new TreeSet<Integer>(hset);
		//ITERATOR
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Covert hashset to arraylist
		//List<Integer> array=new ArrayList<Integer>(hset);
		
		//convert hashset to array
		//Integer[] array=new Integer[hset.size()];
		//hset.toArray(array);
		
				
		
		
		
		
		

	}

}
