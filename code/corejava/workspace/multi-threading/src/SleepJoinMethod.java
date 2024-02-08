public class SleepJoinMethod {
	public static void main(String[] args) {
		System.out.println("STARTED MAIN THREAD");
		SleepJoinThread th = new SleepJoinThread();
		th.start();
		
		try {
			th.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i<=10 ; i++) {
			System.out.println(" i = " + i);
		}
		
		System.out.println("ENDS MAIN THREAD");
	}
}
class SleepJoinThread extends Thread {
	@Override
	public void run() {
		System.out.println("STARTED TABLE THREAD");
		for(int i = 1; i<=10 ; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ENDS TABLE THREAD");
	}
}

