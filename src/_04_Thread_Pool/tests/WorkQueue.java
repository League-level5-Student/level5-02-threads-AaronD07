package _04_Thread_Pool.tests;

public class WorkQueue {
	private Thread[] threads;
	public WorkQueue() {
		int totalThreads =Runtime.getRuntime().availableProcessors() -1;
		threads = new Thread[totalThreads];
	}
public void run() {
	
}
public int getThreadCount() {
	return threads.length;
}
}
