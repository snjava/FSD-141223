public class SynchronizationDemo1 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		PrintThread1 t1 = new PrintThread1(printer);
		PrintThread2 t2 = new PrintThread2(printer);
		t1.start();
		t2.start();
	}
}

class PrintThread1 extends Thread {
	Printer printer;
	public PrintThread1(Printer printer) {
		this.printer = printer;
	}
	@Override
	public void run() {
		synchronized (printer) {
			for(int i =1; i<=10; i++) {
				printer.print("15 * " + i + " = " + (15*i));
				try {
					if(i==5) {
						printer.wait();
					} else {
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class PrintThread2 extends Thread {
	Printer printer;
	public PrintThread2(Printer printer) {
		this.printer = printer;
	}
	@Override
	public void run() {
		synchronized (printer) {
			for(int i =1; i<=10; i++) {
				printer.print("i = " + i);
			}
			printer.notify();
		}
	}
}

class Printer {
	public void print(String value) {
		System.out.println(value);
	}
}
