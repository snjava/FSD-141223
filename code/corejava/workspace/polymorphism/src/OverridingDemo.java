public class OverridingDemo {
	public static void main(String[] args) {
		Doctor obj1 = new Doctor();
		obj1.intro();
	}
}

class Person {
	void intro() {
		System.out.println("Hello, I am a Person..");
	}
	static final public void demo() { // cannot override as this is static and final
		System.out.println("This is Demo method From Person Class");
	}
}

class Doctor extends Person {
	protected void intro() {
		System.out.println("Hi, I am a Doctor");
	}
}