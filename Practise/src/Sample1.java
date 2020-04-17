
public class Sample1 {
public static void main(String[] args) {
	String s="Welcome to Selenium";
	String[] spl=s.split(" ");
	int len=spl.length;
	for (int i = len-1; i>=0 ; i--) {
		System.out.print(spl[i]+" ");
	}
	
}
}
