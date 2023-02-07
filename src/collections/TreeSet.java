package collections;
import java.util.*; 
public class TreeSet {

	public static void main(String[] args) {
		TreeSet<Object> s1=new TreeSet<>(); 
		//TreeSet s1=new TreeSet();
		 s1.add("Rohan"); 
		 s1.add("Riya"); 
		 s1.add("Pooja"); 
		 s1.add(445); 
		 s1.add('A'); 
		 System.out.println("Hash set objectss are: "+s1);
	}

}

//3.Treeset
//----------
//It is a class which implements set interafce.
//Features:
//• Introduced in 1.2v
//• Heterogenous objects are not allowed if we add we will get class cast
//exception
//• Duplicates are not allowed .In case if we add we won't get compile
//time error, it will just add once
//• No NULL object is allowed
//• Data structure is tree.
//• Output is in Sorted Order.
//• Set is only uni directional so it supports only Iterator