package comparatorInterface;

import java.util.Comparator;

public class AgeComparator implements Comparator<Author>{
	public int compare(Author age1,Author age2)
	{
		if(age1.auage==age2.auage)
			return 0;
		else if(age1.auage>age2.auage)
			return 1;
		else return -1;
		
	}

}
