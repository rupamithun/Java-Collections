package overridehashequal;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		
Employee emp1=new Employee(1);
Employee emp2=new Employee(1);

Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(emp1, "John");
		map.put(emp2, "John");
System.out.println(map.size());
System.out.println(map.entrySet());

Integer i=new Integer(1);
Integer i1=new Integer(1);
Map<Integer,String> map1=new HashMap<Integer,String>();
map1.put(i, "John");
map1.put(i1, "John");
System.out.println(map1.size());
		
	}

}
