public class StaticKeyword2 {
	public static void main(String[] args) {
		System.out.println("This is Main Method");
		System.out.println(Company.name);
		/*Company.Location location = new Company.Location();
		location.printLocations();*/
		//Company.Location.printLocations();
	}
}
class Company {
	static String name; // Static variable
	static // static block
	{
		System.out.println("Static Block called");
		name = "ABC pvt.ltd";
	}
	public static final void leavePolicies() { // static method
		System.out.println("Leave Policies");
	}
	static class Location { // static class (Must be nested class)
		public void printLocations() {
			System.out.println("Company Located at Pune, Mumbai, Banglore");
		}
	}
}
