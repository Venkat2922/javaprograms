import java.util.Scanner;

public class ArrayMissingNumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the array size");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("enter the array elements");
for(int i=0;i<a.length-1;i++) {
	a[i]=s.nextInt();
}
String reverse = null;
System.out.println("Reversing order is:"+reverse);
//int sum=0;
for(int j=0;j<a.length-1;j--) {
	System.out.println(a[j]);
	//sum=sum+a[j];
//System.out.println("sum is:"+sum);
//long average=sum/a.length;
//System.out.println(a[a.length-1]);
}

	
	}
}


