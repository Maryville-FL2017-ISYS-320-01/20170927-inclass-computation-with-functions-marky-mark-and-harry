
public class PayProgram {

	public static void main(String[] args) {
		totalPay();
	}
	public static void totalPay() {
		System.out.println(computePay(4.00, 11) + computeOvertime(3.00, 6));
	}
	public static double computePay(double salary, int hours) {
		double pay = (salary * hours - 8);
		return pay;
	}
	
	public static double computeOvertime(double opay, int ohours) {
		double overtime = (ohours - 8) *1.5;
		return overtime;
	}
}
