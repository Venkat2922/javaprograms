package objectClass;

public class ObjectClass {
	int age;
	String name;
	public ObjectClass(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	
				
//	@Override
//	public String toString() {
//	
//			return "ObjectClass[age="+age+",name="+name+"]";
//				}

@Override
	public String toString() {
		return "ObjectClass1 [age=" + age + ", name=" + name + "]";
	}


public static void main() {
	ObjectClass o=new ObjectClass(15, "venkat");
	
	System.out.println(o.toString());

	}
	
	}


