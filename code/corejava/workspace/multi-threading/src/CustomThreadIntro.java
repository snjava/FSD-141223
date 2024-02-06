
public class CustomThreadIntro {
	public static void main(String[] args) {
		System.out.println("main Thread Started....");
		CustomThread customThread = new CustomThread();
		customThread.setName("sample-thread"); // to set the name of the thread
		customThread.setPriority(10); // to set the priority of the thread.
		customThread.start(); // to make thread ready to run
		System.out.println("main Thread Ends....");
	}
}

class CustomThread extends Thread
{
	@Override
	public void run() { // method is use to assign task to a thread
		System.out.println("Custom Thread Started....");
		//System.out.println(10/0);
			System.out.println(Thread.currentThread());
		System.out.println("Custom Thread Ends....");
	}
}
