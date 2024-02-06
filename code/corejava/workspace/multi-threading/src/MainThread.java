public class MainThread {
	public static void main(String[] args) {
		System.out.println("Start of main Method.");
		
		Thread th = Thread.currentThread(); // Is use to get the object of currently executed thread 
		
		System.out.println(th);
		// th.stop();
		
		System.out.println("End of main Method.");
	}
}
