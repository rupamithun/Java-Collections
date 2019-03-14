package arraylistcompare;

public class StudentInfo implements Comparable<StudentInfo>{
	
	int rollno;
	String name;
	int age;
	public StudentInfo(int sroll,String sname,int sage)
	{
		this.rollno=sroll;
		this.age=sage;
		this.name=sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public int compareTo(StudentInfo Stud)
{
int roll=((StudentInfo)Stud).getRollno();
return this.rollno-roll;

}


}
