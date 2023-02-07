package practiceJava;

public class SumandAvgOfArray {

	public static void main(String[] args) {
int a[]= {5,10,35,25};
int sum=0;
for (int i=0;i<a.length;i++) {
	sum=sum+a[i];
	
}
System.out.println(sum);
	//int avg=sum/a.length;(it gives avg is without decimal)
	double avg= sum/a.length;
System.out.println(avg);
	}

}
