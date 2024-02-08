public class SynchronizationDemo {
	public static void main(String[] args) {
		TablePrinter tablePrinter = new TablePrinter();
		Thread1 t1 = new Thread1(tablePrinter);
		Thread2 t2 = new Thread2(tablePrinter);
		t1.start();
		t2.start();
		tablePrinter.print(5);
	
	}
}

class Thread1 extends Thread {
	TablePrinter tablePrinter;
	public Thread1(TablePrinter tablePrinter) {
		this.tablePrinter = tablePrinter;
	}
	@Override
	public void run() {
		tablePrinter.print(13);
	}
}

class Thread2 extends Thread {
	TablePrinter tablePrinter;
	public Thread2(TablePrinter tablePrinter) {
		this.tablePrinter = tablePrinter;
	}
	@Override
	public void run() {
		tablePrinter.print(22);
	}
}

class TablePrinter {
	public synchronized void print(int num) {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
