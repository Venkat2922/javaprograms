package Basicprograms;
public class SumOfPrimenumbers{
	public static void main(String[] args) {
		int sum=0;
		for(int num=2;num<=10;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
					
				}
			
			if(count==2) {
				
			}
			
			sum=sum+num;
		}}
			System.out.println(sum);
	}
	

}
