package practiceJava;

public class Scond_MinimumNumberArray {

	public static void main(String[] args) {
		int a[]= {22,45,69,88,9}; 
		 int fmin=a[0],secmin=a[0]; 
		 for(int i=1;i<a.length;i++) 
		 { 
		 if(a[i]<fmin) 
		 { 
		 secmin=fmin; 
		 fmin=a[i]; 
		 } 
		 else if(a[i]<secmin) 
		 { 
		 secmin=a[i]; 
		 } 
		 } 
		 System.out.println("minimum value : "+fmin); 
		 System.out.println("second minimum value : "+secmin);
	}

}
