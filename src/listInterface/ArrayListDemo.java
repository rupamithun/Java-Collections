package listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> obj = new ArrayList<String>();
//ArrayList<String> obj=new ArrayList<String>(Array.asList(1,2,3));//initialization
obj.add("One");
obj.add("Two");
obj.add("Three");
obj.add("Four");
obj.add("Five");

		
		  System.out.println("LIST Before adding elements:"); for(String str:obj)
		  System.out.println(str);
		  
		  obj.add("Six"); System.out.println("After add:"); for(String str1:obj)
		  System.out.println(str1);
		  
		  obj.add(3,"Four Four");
		  System.out.println("After adding element to index 3:"); for(String str2:obj)
		  System.out.println(str2);
		  
		  obj.remove("three");//remove(int index);
		  System.out.println("After remove three:"); for(String str3:obj)
		  System.out.println(str3);
		  
		  obj.set(3,"4");//set() replaces or update the existing element to new element
		  System.out.println("After set method:"); for(String str4:obj)
		  System.out.println( str4);
		  
		  int a=obj.indexOf("three");//store the index value of particular element int
		  int b=obj.indexOf("zero"); System.out.println("a="+a +"b="+b);
		  
		  String s=obj.get(4); int c=obj.size();
		  
		  System.out.println(s); System.out.println(c);
		  
		  System.out.println(obj.contains("Three"));
		 

		//Iterator
		  Iterator<String> it=obj.iterator(); while(it.hasNext()) {
		  System.out.println(it.next()); }
		 
ArrayList<Integer>obj2=new ArrayList<Integer>(Collections.nCopies(10,3));
Enumeration<Integer> enum1=Collections.enumeration(obj2);

while(enum1.hasMoreElements()) {
	System.out.println(enum1.nextElement());
}
ArrayList<Integer> obj1=new ArrayList<Integer>(Arrays.asList(12,21,3,44,5,63,7));
//sublist to arraylist store
ArrayList<Integer> obj11=new ArrayList<Integer>(obj1.subList(1, 3));
//sublist to list
//List<Integer>list=obj1.subList(2,3);
//compare-for(int temp:al1)//al3.add(contains(temp)?"yes":"NO")
//List<String> str=Collections.synchronizedList(new ArrayList<String>());//synchronizes(str){}
// CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
//toString()-array of objects and to get output in desired format

System.out.println("Sorting arraylist");
Collections.sort(obj1);
for(int a1:obj1)
{
	System.out.println(a1);
}
System.out.println("Reverse order");
Collections.sort(obj1,Collections.reverseOrder());
for(int a2:obj1)
{
	System.out.println(a2);
}

	}

	private static Comparator reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
