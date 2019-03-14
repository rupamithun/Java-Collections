package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		hmap.put(0, "R");
		hmap.put(4, "t");
		hmap.put(2, "f");
		hmap.put(5, "e");
		hmap.put(22, "tt");
		hmap.put(62,"a");
		hmap.put(1, "w");
		hmap.put(3, "p");
		
		
		
		
		
		  //For SORTING USING THE SYNTAX BELOW 
		Set<Map.Entry<Integer, String>> values = hmap.entrySet();
		  for(Map.Entry<Integer,String> temp:values) 
		  {
		  System.out.println(temp.getKey()+ ":" +temp.getValue());
		  
		  } String str=hmap.get(4); System.out.println("str on 4 is "+str);
		 
		
		//USING ITERATOR
		Set set=hmap.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext())
		{
	Map.Entry mentry=(Map.Entry)ite.next();
	
System.out.println("the key value is "+mentry.getKey()+"the value is "+mentry.getValue());
		}
		//removing key-value pair
		Object element1=hmap.remove(22);
		System.out.println(element1);
		
		
		
		
		/*
		 * hmap.remove(4); Set<Map.Entry<Integer, String>> values1 = hmap.entrySet();
		 * for(Map.Entry<Integer,String> temp1:values1) {
		 * System.out.println(temp1.getKey()+ ":" +temp1.getValue());
		 * 
		 * }
		 * 
		 * 
		 */
		

	}

}
