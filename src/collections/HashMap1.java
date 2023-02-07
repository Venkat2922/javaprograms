package collections;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
			 HashMap<Integer,String> m1=new HashMap<>(); 
			 m1.put(101,"Samsung"); 
			 m1.put(102,"Realme"); 
			 m1.put(103,"Oppo"); 
			 m1.put(104,"Vivo"); 
			 System.out.println("Map Objects are : "+m1); 
			 
			 m1.put(103, "Redmi"); 
			 System.out.println("Duplicate key : "+m1); 
			 m1.put(105, "Samsung"); 
			 System.out.println("Duplicate Value : "+m1); 
			 System.out.println("All keys : "+m1.keySet()); 
			 System.out.println("All Values : "+m1.values()); 
			 System.out.println("Particular Value : "+m1.get(102)); 
			 System.out.println("Check key : "+m1.containsKey(1001)); 
			 System.out.println("Check Value : "+m1.containsValue("Iphone")); 
	}

}


//HashMap 
//--------- 
//• HashMap is a class which implements Map interface. 
//Features 
//• introduced in 1.2v 
//• heterogenous data allowed 
//• Data structure is hashtable 
//• duplicate keys are not allowed but values can be duplicate 
//• random order based on hashcode 
//• only one null key is allowed and multiple null values are allowed
