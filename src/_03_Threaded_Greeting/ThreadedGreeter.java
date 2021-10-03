package _03_Threaded_Greeting;

public class ThreadedGreeter {
	int x;
	
	public ThreadedGreeter(int i) {
		x=1;
	}
public void run() {
	System.out.println("Hello from thread number" + x);
	Thread t = new Thread((Runnable) new ThreadedGreeter(x+1));
	if(x<=50) {
		Thread i = new Thread();
	}
}
}
