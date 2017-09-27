/*
	ISYS 320
	Name(s): Harrison Greer and Mark Kriegsies
	Date: 9/27/2017
*/

/*
 What were the errors you found?
 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf, tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      System.out.println("Body temp in C is: " + tempc);
	      return tempf;
    }
}
