
public class PrimeNum {
public static void main(String[] args) {
	int flag=0;
	int n=5;
	int m=n/2;
	
	if (n==0||n==1) {
		System.out.println("Not Prime");
	} else {
		for (int i = 2; i <=m; i++) {
			if (n%i==0) {
				System.out.println("Not Prime");
				flag=1;
				break;
			}
			}
	}
	if (flag==0) {
		System.out.println("Prime");
	}
}
}
