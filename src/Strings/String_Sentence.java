package Strings;

public class String_Sentence {
	

		public static void main(String[] args) {
			String s= "khatam ta ta bye bye";
			String[] str=s.split(" ");
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]+ " "+(i+1));
			}
		}

	}


