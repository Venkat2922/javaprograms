package wrapperClass;

public class String_RespectiveDataType {

	public static void main(String[] args) {
String s="123";
int i=Integer.parseInt(s);
System.out.println(i+1);

double d=Double.parseDouble(s);
System.out.println(d+1);

boolean b=Boolean.parseBoolean(s);
System.out.println(b);

short st=Short.parseShort(s);
System.out.println(st+12);


float f=Float.parseFloat(s);
System.out.println(f+1.3);


byte be=Byte.parseByte(s);
System.out.println(be+1);

	}

}
