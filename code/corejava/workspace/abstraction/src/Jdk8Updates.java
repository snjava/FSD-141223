
@FunctionalInterface
public interface Jdk8Updates {
	public static void m1() {
		System.out.println("static method inside Interface");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method from Interface...");
		m1();
	}
	
	public default void m2() {
		System.out.println("m2() from interface");
	}
	
	public void test();
}
