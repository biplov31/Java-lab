// implement Runnable interface or extend Thread class
public class FirstThread extends Thread{ // FirstThread is a child class of the ultimate class Object, that is in java.lang package so we don't have to import any package to access Thread class. FirstThread inherits the methods available by default
	public void run() {
		
		System.out.println("Thread started.");
		
		String threadName = this.currentThread().getName();
		System.out.println(threadName + " started.");
		
		for(int i=0; i<5; i++){
			System.out.println("Printing " + i + " from " + threadName);
		}
	}
}