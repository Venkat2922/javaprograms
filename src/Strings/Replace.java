package Strings;

public class Replace {

	public static void main(String[] args) {
		String s1="  testyantra ";
		String s2="VENKANNABABU";
		String s3="";
		System.out.println(s1.replace('a', 'e'));
		System.out.println(s1.replace("ty", "n"));
		System.out.println(s2.replaceAll("[AEIOU]", "O"));
		System.out.println(s1.replaceAll("[1023456789]", "z"));
		System.out.println(s2.replaceFirst("V", "7"));
		
		
		
		
	}

}
