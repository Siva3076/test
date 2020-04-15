
public class Sample {
	
public static void main(String[] args) {
	int a=1020304050;
	System.out.println("Before: "+a);
	String s= String.valueOf(a);
	String ss = s.replaceAll("0", "");
	a=Integer.parseInt(ss);
	System.out.println("After: "+a);
}
}
