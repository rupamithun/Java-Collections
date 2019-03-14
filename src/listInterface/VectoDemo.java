package listInterface;


import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vec=new Vector<String>(3);
		vec.addElement("Apple");
		vec.addElement("mango");
		vec.addElement("orange");
		vec.addElement("Banana");
		vec.addElement("potato");
		vec.addElement("watermelon");
		
		System.out.println("The size of vec is" +vec.size());
		System.out.println("the capacity is"  +vec.capacity());
		
		vec.addElement("Carrot");
		vec.addElement("beetroot");
System.out.println("the sixe after add is" +vec.size());
System.out.println("the capacity after add is"  +vec.capacity());
//CREATING SUBLIST
List vec2= vec.subList(2, 5);
System.out.println("Sublist");
for (int i=0;i<vec2.size();i++)
{
	
	System.out.println(vec2.get(i));
}

//SORT ASCENDING ORDER
Collections.sort(vec);
System.out.println("Ascending order");
for (int i=0;i<vec.size();i++)
{
	
	System.out.println(vec.get(i));
}
	}
	
}
