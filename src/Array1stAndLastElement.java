import java.util.Scanner;

public class Array1stAndLastElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
		a[i]=s.nextInt();
	}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);

}
}
