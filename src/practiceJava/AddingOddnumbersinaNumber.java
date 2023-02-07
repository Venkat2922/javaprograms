package practiceJava;

public class AddingOddnumbersinaNumber {

	public static void main(String[] args) {
		int i=45678;
		int rem=0;
		int sum=0;
		while (i!=0) {
			rem=i%10;
			
			if(rem%2==1) {
				sum=sum+rem;
			}
			i=i/10;
		}
		System.out.println(sum);
	}

}
