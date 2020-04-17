
public class NumberRev {
public static void main(String[] args) {
	int temp, rev=0;
	int org=123;
	temp=org;
	while (org!=0) {
		rev=rev*10;
		rev=rev+org%10;
		org=org/10;
	}
	System.out.println("Rev: "+rev);
	if (temp==rev) {
		System.out.println("Palin");
	} else {
System.out.println("Not Palin");
	}
}
}
