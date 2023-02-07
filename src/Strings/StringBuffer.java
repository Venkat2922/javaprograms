package Strings;

public class StringBuffer {

	public static void main(String[] args) {
StringBuffer sb=new StringBuffer("Testyantra");
StringBuffer sb1=new StringBuffer("Testyantra1");
System.out.println(sb.equals(sb1));
System.out.println(sb==sb1);
System.out.println(sb1.append(sb));
System.out.println(sb);
System.out.println(sb1);

	}

}
