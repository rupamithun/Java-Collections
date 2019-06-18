package priorityqueue;

import java.util.Comparator;

public class comparator implements Comparator<String>
{
public int compare(String s1,String s2)
{
	String str1=s1;
	String Str2=s2;
	return str1.compareTo(Str2);
}
}
