package practiceJava;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] a= {2,5,6,5,7,7,9};
		for(int i=0;i<a.length;i++) 
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]&& i>j)
				{
					break;
				}
				if (a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
			{ 
					System.out.println("Duplicate value is"+a[i]);
				
			}
		}
	


	}

}
