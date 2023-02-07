package Strings;

public class StringPalindrome {
	public  static void main(String[] args) {
		String s="MADAM";
		String rev="";
		for (int i=0;i<s.length();i++) {
			rev=rev+s.charAt(i);
			//System.out.println(rev);
		}
		if(rev.equals(s)) {
			System.out.println(s+"is a polindrome");
		}
		else {
			System.out.println(s+"is a not polindrome ");
			
			
		}
	}

}
