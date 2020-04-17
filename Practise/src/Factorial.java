
public class Factorial {
public static void main(String[] args) {
	int fact=1;
	int n=4;
	if (n<0) {
		System.out.println("Neg");
	} else {
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
		}
System.out.println(fact);
	}
}
}
