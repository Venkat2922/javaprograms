package practiceJava;

public class AddingDigits {

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

	}

}

//Model-2