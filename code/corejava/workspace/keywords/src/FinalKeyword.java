public class FinalKeyword {
	public static void main(String[] args) {
		MathCalculation math = new MathCalculation();
		math.caluclate();
	}
}

// Final classes cannot be used as a parent class. You cannot inherit final class
final class MathCalculation {
	// the value of the variable will be fix(constant)
	final double pi = 3.14;
	
	// implementation of final method will be fix and it cannot be override
	public final void caluclate() {
		System.out.println("Value of PI = " + pi); // 3.14
	}
}
