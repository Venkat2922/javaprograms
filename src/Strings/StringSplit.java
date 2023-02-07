package Strings;

public class StringSplit {

	public static void main(String[] args) {
String s="DJTILLU IS A HERO";
String[] str=s.split(" ");

for(int i=0;i<str.length;i++) {
	String rev="";
	String s2=str[i];
	for(int j=0;j<s2.length();j++) {
		 rev=s2.charAt(j)+rev;
	}
	
System.out.print(rev+ " ");
	
}
	}

}
