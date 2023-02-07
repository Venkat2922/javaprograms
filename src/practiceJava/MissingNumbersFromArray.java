package practiceJava;

public class MissingNumbersFromArray {

public static void main(String[] args) {
int []a= {1,2,3,5,6,7};
boolean status=true;
for(int i=1;i<=10;i++) {
	for(int j=0;j<a.length;j++) {
		if  (i==a[j]) {
			status=false;
			break;
		}
	}
			if(status==true) {
				System.out.println(i+" ");
			}
				
				else {
					
					status=true;
				}
		}
		}
	}

	


