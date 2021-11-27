package _06_Wait_and_Notify.Practice;

public class SplitLoopTester implements Runnable{
	static Object threadLock = new Object();
	static int totalThreads = 0;
	private int thread;
	public SplitLoopTester() {
		totalThreads++;
		thread = totalThreads;
	}
	
	@Override
	public void run() {
		synchronized(threadLock) { 
			System.out.println("200");
			threadLock.notify();
			try {
				threadLock.wait();
			} catch (InterruptedException e) {
				System.out.println("error!");
			}
			
			
			threadLock.notify();
			try {
				threadLock.wait(); 
			} catch (InterruptedException e) {
				System.out.println("error!");
			}
			
			
			threadLock.notify();
			try {
				threadLock.wait(); 
			} catch (InterruptedException e) {
				System.out.println("error!");
			}
			
			
			threadLock.notify(); 
		}
	}


}
