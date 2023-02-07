package practiceJava;

public class Adding2Arrays {

	public static void main(String[] args) {
int a[]= {11,2,3,4};
int b[]= {9,8,7,23,45};
//for(int i=0;i<a.length;i++) {
	int length=a.length;
	if (a.length <b.length) {
		length=b.length;
	}
	for(int i=0;i<length;i++) {
		try {
			System.out.println(a[i]+b[i]);
			
		} catch (Exception e) {
			if(a.length>b.length) {
				System.out.println(a[i]);
		}
			else {
				System.out.println(b[i]);
			}
		
	}
}
	}

}
