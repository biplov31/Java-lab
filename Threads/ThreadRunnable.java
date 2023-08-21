// implementing Runnable is preferred over extending Thread because Java does not support inheriting from multiple parents due to ambiguity issues

public class ThreadRunnable implements Runnable{
	// (public static final) int num = 5;
	public void run(){  // class has to override methods of the interface it is implementing
		process();
	}
	
	private void process(){
		String threadName = this.currentThread().getName();
		System.out.println(threadName + " started.");
		
		for(int i=0; i<5; i++){
			System.out.println("Printing " + i + " from " + threadName);
		}
	}
	
}