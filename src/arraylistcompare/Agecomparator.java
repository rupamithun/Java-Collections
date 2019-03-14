package arraylistcompare;

import java.util.Comparator;

public class Agecomparator implements Comparator<StudentInfo>{
	
public int compare(StudentInfo a1,StudentInfo a2)
{

if(a1.age>a2.age)
return 0;
else if(a1.age<a2.age)
	return 1;
else return -1;
}
}
