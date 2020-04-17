
public class Pattern {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(""+j);
		}
		System.out.println(" ");
	}
	
	/*
	 * for (int i = 1,r=5; i <=5; r--,i++) { for (int j = 1; j <=r; j++) {
	 * System.out.print("*"); } System.out.println(" "); }
	 */
}
}
