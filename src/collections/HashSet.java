package collections;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		HashSet s1=new HashSet(); 
		 s1.add("java"); 
		 s1.add(1223); 
		 s1.add("selenium"); 
		 s1.add(88.9f); 
		 
		 Iterator i1=s1.iterator(); 
		 while(i1.hasNext()) 
		 { 
		 System.out.println(i1.next()); 
		 } 
		}}
