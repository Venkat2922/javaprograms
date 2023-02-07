package collections;

import java.util.Iterator;

public class LinkedHashSet {

		public static void main(String[] args) { 
			 //LinkedHashSet<Object> s1=new LinkedHashSet<>(); 
			LinkedHashSet<String> s1=new LinkedHashSet();
			 s1.add("Rohan"); 
			 s1.add("Riya"); 
			 s1.add("Pooja"); 
			 s1.add(445); 
			 s1.add('A'); 
			 System.out.println("Hash set objectss are: "+s1); 
			 s1.add("Riya"); 
			 s1.add(445); 
			 System.out.println("After add duplicates: "+s1); 
			 s1.add(null); 
			 s1.add(null); 
			 System.out.println("After adding null objects: "+s1); 
			 System.out.println("-------Forward direction-----"); 
			 Iterator<Object> i1=s1.iterator(); 
			 while(i1.hasNext()) 
			 { 
			 System.out.println(i1.next()); 
			 } 
	}

}

//2.LinkedHashSet 
//---------------- 
//It is a class which extends HashSet and implements set interface. 
//Features: 
//• Introduced in 1.2v 
//• Heterogenous objects are allowed 
//• Duplicates are not allowed. In case if we add we won't get compile 
//time error, it will just add once 
//• only one NULL object is allowed 
//• Data structure is Linkedlist. 
//• Insertion order is preserved. 
//• Set is only uni directional so it supports only Iterator 
////Same program only difference is output is as per insertion order//
