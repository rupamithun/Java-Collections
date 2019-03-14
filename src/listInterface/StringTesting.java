package listInterface;

import java.util.ArrayList;
import java.util.Collections;

public class StringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("NIL0");
		ls.add("4");
		Collections.sort(ls);
		System.out.println(ls);

	}

}
