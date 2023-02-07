package wrapperClass;

public class UnBoxing {

	public static void main(String[] args) {
// Model-1
		int a=12;
		Integer a1=Integer.valueOf(a);
		int a2=a1.intValue();
		System.out.println(a2);
		
		float f=1.2f;
		Float f1= Float.valueOf(f);
System.out.println(f1);		
	



  // Model-2 
//Integer a=2; 
//int a=a.intValue(); 
//System.out.println(a1);
// 
// short s=25; Short s1=s.intValue(); 
//System.out.println(s1);

//Model-3(Creating Obj and then unboxing)
Integer i=new Integer(100);
int i1=i.intValue();
System.out.println(i1);

Double d=new Double(1.2);
double d1=d.doubleValue();
System.out.println(d1);


}
}