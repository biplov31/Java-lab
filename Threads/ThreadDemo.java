// multitasking is thread based or process based
public class ThreadDemo{
	// at least one thread "main" is always executing in Java. that thread is created by JVM (a process) by default
	public static void main(String[] args){
		
		// String name = new String("Radha");	
		FirstThread ft = new FirstThread(); // new thread
		ft.setName("Loan Processing thread");
		ft.setPriority(1); // since we have reduced the priority from default 5 to 1, second thread is executed first
		ft.start();  // ft.run() gives the same output but it is running in the main thread and not the one we created. our thread has to go in runnable state by using start() method which is provided by the Thread class
		// ft.run() // with run() threads run sequentially but with start() threads run in parallel aka multithreading
	
	
		FirstThread ft2 = new FirstThread();
		ft2.setName("SMS Processing Thread");
		ft2.start(); 
	}
}

