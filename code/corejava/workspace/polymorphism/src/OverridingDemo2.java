
public class OverridingDemo2 {
	public static void main(String[] args) {
		Bank bank = new ICICI(); // Polymorphic Object
		bank.homeLoanROI();
	}
}

class Bank {
	public void homeLoanROI() {
		System.out.println("Bank ROI : 9.5");
	}
	public String toString() {
		return "Object Of Bank Class";
	}
}

class ICICI extends Bank {
	public void homeLoanROI() {
		System.out.println("ICICI ROI : 9.8");
	}
}
