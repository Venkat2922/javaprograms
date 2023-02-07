package practiceJava;

public class OccuranceOfNumbers {
	public static void main(String[] args) {
	int a[]= {3,4,2,5,7,8};
	int count=0;
	int temp=a[4];
	for (int i=0;i<a.length;i++) {
		//int temp=a[1];
		if(temp==a[i]) 
			{
				count++;
				
			}
		}
		System.out.println(temp+"occured"+count+"times");
	}
	}

	


