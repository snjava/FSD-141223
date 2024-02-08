public class SuspendResume {
	public static void main(String[] args) {
		System.out.println("STARTED main Thread");
		
		SuspendResumeThread thread = new SuspendResumeThread();
		thread.start();
		
		thread.suspend();
		
		for(int i = 1; i<=10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("ENDS main Thread");
		thread.resume();
	}
}


class SuspendResumeThread extends Thread {
	@Override
	public void run() {
		System.out.println("STARTED Suspend Resume Thread");
		
		System.out.println("ENDS Suspend Resume Thread");
	}
}