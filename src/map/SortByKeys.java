package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SortByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashMap<Integer,String>hmap1=new HashMap<Integer,String>();
	hmap1.put(2, "mango");
	hmap1.put(45, "apple");
	hmap1.put(55, "blueberry");
	hmap1.put(1, "goa");
	hmap1.put(0, "orange");
	hmap1.put(100, "banana");
	
	
//normal execution
	Set set1=hmap1.entrySet();
	Iterator it1=set1.iterator();
	while(it1.hasNext())
	{
		Map.Entry mentry1=(Map.Entry)it1.next();
		System.out.println("the key value is "+mentry1.getKey()+"the value is "+mentry1.getValue());
		
	}
	
	//SORTING BY KEY VALUE
	Map<Integer,String>map=new TreeMap<Integer,String>(hmap1);
	System.out.println("After Sorting by keys");
	Set set2=map.entrySet();
	Iterator it2=set2.iterator();
	while(it2.hasNext()) {
		Map.Entry mentry2=(Map.Entry)it2.next();
		System.out.println("the key value is "+mentry2.getKey()+"the value is "+mentry2.getValue());
	}
		
		

	}
}


