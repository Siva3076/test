
public class StringExample {
public static void main(String[] args) {
	String s="Welcome to Selenium";
	if (s.equalsIgnoreCase("welcome to selenium")) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}
}
}
