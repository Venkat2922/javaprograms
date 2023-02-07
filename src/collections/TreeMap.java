package collections;
import java.util.*; 

public class TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> m1=new TreeMap<>(); 
		//TreeMap m1=new TreeMap();
		 m1.put(101,"Rahul"); 
		 m1.put(102,"Riya"); 
		 m1.put(103,"Pooja"); 
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

//TreeMap 
//--------- 
//• TreeMap is a class which implements Map interface. 
//Features 
//• introduced in 1.2v 
//• only homogenous data allowed ,if we add heterogeneous objects will 
//get class cast exception 
//• Data structure is Tree 
//• duplicate keys are not allowed but values can be duplicate 
//• sorting order. 
//• Null keys are not allowed.
