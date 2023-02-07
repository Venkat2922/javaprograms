package practiceJava;

public class AddingNumberandAgain_Adding {

	public static void main(String[] args) {
		int i=456;
		int rem=0;
		int sum=0;
		while (i!=0) {
			rem=i%10;
			sum=sum+rem;
			i=i/10;
		}
		System.out.println(sum);
	
	int sum1=0;
	while(sum!=0) {
		sum1=sum1+sum%10; 
	sum=sum/10;
	}
	System.out.println(sum1);

}
}