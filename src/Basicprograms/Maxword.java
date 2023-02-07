package Basicprograms;

public class Maxword {

	public static void main(String[] args) {
		        String str = "i am an automation engineer";
		        String[] words = str.split(" ");
		        int maxLength = 0;
		        for (String word : words) {
		            if (word.length() > maxLength) {
		                maxLength = word.length();
		            }
		        }
		        System.out.println("The maximum length of a word in the string is: " + maxLength);
		    }
		}

	


