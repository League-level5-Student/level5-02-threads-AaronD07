package _03_Threaded_Greeting;

import java.util.Stack;

public class ThreadedGreeter implements Runnable {
int x;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Hello from thread number: " + x);
		if(x<50) {
			int y = x+1;
			
			Thread z = new Thread((Runnable) new ThreadedGreeter(y));
			z.start();
			
		}
	}
	public ThreadedGreeter(int x) {
		this.x=x;
		x=1;
	}
	

	
}



