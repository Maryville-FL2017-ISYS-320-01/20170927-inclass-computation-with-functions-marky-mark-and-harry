/*
	ISYS 320
	Name(s): Harrison Greer and Mark Kriegsies
	Date: 9/27/2017
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
		computeScientificValue(6.5, 3);
		
	}
	public static void computeScientificValue(double base, double x) {
		System.out.println(Math.pow(10,x) * base);
}
}	
