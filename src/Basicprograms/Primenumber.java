package Basicprograms;

public class Primenumber {

	public static void main(String[] args) {
		int num=17,prime=0;
		
		for(int i=1;i<=num;i++) {
			
			
				if(num%i==0) {
					
					prime++;
				}
				}
				if(prime==2) {
				System.out.println("given number is prime");	
				}
				else {
					System.out.println("Not prime");
			}
			

	}
}
