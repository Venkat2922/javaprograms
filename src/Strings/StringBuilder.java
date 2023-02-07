package Strings;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Testyantra");
		StringBuilder sb1=new StringBuilder("Testyantra");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		System.out.println(sb1.append(sb1));
		System.out.println(sb);
		System.out.println(sb1);

	}

}
