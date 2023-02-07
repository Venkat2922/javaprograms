  package collections_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollFrame implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {

		String i=(String)o1;
		String i1=(String)o2;
		if(i.compareTo(i1)>0) {
			return 1;
		}
		else if(i.compareTo(i1)<0) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add("Venkat");
a.add("Tharun");
a.add("Raj");
a.add("Hari");
System.out.println(a);
Collections.sort(a, new CollFrame());
System.out.println(a);
	
	}

	
	}


