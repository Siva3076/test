import java.util.Scanner;

public class StringRev {
public static void main(String[] args) {
	String org, rev="";
	Scanner sc = new Scanner(System.in);
	org=sc.nextLine();
	System.out.println("Org:"+org);
	int len=org.length();
	for (int i = len-1; i>=0; i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println("Rev:"+rev);
	if(org.equals(rev)) {
		System.out.println("Palin");
	}
	else {
		System.out.println("Not Palin");
	}
}
}
