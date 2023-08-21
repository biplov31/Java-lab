public class RunnableDemo extends Object{
	public static void main(String[] args) throws InterruptedException {
		// two instances of a class have different hashCodes so they are not the same. but runnable is now the same instance of the class ThreadRunnable so we can use it in both of our threads
		ThreadRunnable runnable = new ThreadRunnable();
		
		Thread ft = new Thread(runnable); // parameterized constructor that takes target as an argument. target is the class that is implementing the interface 
		ft.setName("Loan Processing Thread");
		ft.setPriority(1);
		ft.start();
		
		Thread st = new Thread(runnable);
		st.setName("SMS Processing Thread");
		st.start();
		
		ft.join();
		st.join(); // now main thread is executed only after both of the threads have completed
		
		System.out.println("Main thread end."); // the threads could keep running from the thread scheduler even after the main thread has already ended
	}
}

// we don't need to import Interger because it lies in java.lang package