package Strings;

public class OccuranceOfCharacter {

		public static void main(String[] args) {
			String s = "aaaabbbccda";

			for (int i = 0; i < s.length(); i++) {
				int count = 1;// Already a value present
				{
					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(i) == s.charAt(j)) {
							count++;
							i++;
						}
						else {
							break;
						}
					}
					System.out.println(s.charAt(i) + " " + count);
				}
			}
		}
	}


