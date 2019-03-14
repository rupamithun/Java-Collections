package arraylistcompare;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentInfo>{

	public int compare(StudentInfo s1,StudentInfo s2)
	{
		String s1name=s1.getName();
		String s2name=s2.getName();
		return s1name.compareTo(s2name);
	}
}
