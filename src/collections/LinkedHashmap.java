package collections;

import java.util.LinkedHashMap;

public class LinkedHashmap {

		public static void main(String[] args) { 
			 LinkedHashMap<Integer,String> m1=new LinkedHashMap<>(); 
			 m1.put(388,"Rahul"); 
			 m1.put(1,"Riya"); 
			 m1.put(103,"Pooja"); 
			 // m1.put("334",445);
			 System.out.println(m1); 
			 System.out.println(m1.keySet()); 
			 System.out.println(m1.values()); 
			 System.out.println( m1.get(101)); 
			 System.out.println(m1.get(334)); 
			 System.out.println(m1.containsKey(1002)); 
			 System.out.println(m1.containsValue("Java")); 
			 m1.put(101,"Sanju"); 
			 m1.put(103,"Pooja1.0"); 
			 System.out.println("After adding duplicate keys"+m1); 
			 m1.put(null,"Pooja2.0"); 
			 System.out.println(m1); 
			 m1.put(null,"Pooja3.0"); 
			 System.out.println(m1);
		}
}
			
	

//LinkedHashMap :
//• LinkedHashMap is a class which extends HashMap and implements Map 
//interface. 
//Features 
//• introduced in 1.4v 
//• heterogenous data allowed 
//• Data structure is hashtable 
//• duplicate keys are not allowed but values can be duplicate,if we add 
//duplicate key it 
//• replaces with original one. 
//• As per Insertion order 
//• only one null key is allowed and multiple null values are allowed.
////Only difference is output is as per insertion order// 

