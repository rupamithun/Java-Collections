package setInteface;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<String,String> hash= new Hashtable<String,String>();

		hash.put("Key1","Chaitanya"); 
		hash.put("Key2","Ajeet");
		hash.put("Key3","Peter");
		hash.put("Key4","Ricky");
		hash.put("Key5","Mona");
		
		//Iterating using Enumeration
Enumeration<String>	names= hash.keys();
		while(names.hasMoreElements())
		{
		String key=(String)names.nextElement();
		 System.out.println("Key: " +key+ " & Value: " +
			      hash.get(key));
		}
	}

}
