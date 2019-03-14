package arraylistcompare;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentInfo> StudInf=new ArrayList<StudentInfo>();
		StudInf.add(new StudentInfo(22,"Rita",45));
		StudInf.add(new StudentInfo(11,"Marry",22));
		StudInf.add(new StudentInfo(1,"John",22));
		Collections.sort(StudInf);
		Collections.sort(StudInf, new Agecomparator());
		Collections.sort(StudInf, new NameComparator());
	
	
		for(StudentInfo Stud:StudInf)

		{
			System.out.println("rollno:" +Stud.rollno+ "Name:" +Stud.name+ "Age:"+Stud.age);
		}
	
	}

}
