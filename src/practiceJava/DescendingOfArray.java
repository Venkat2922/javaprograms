package practiceJava;

import java.util.Arrays;

public class DescendingOfArray {

	public static void main(String[] args) {
		int a[]= {55,15,46,74,58,81};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
			}

	}


