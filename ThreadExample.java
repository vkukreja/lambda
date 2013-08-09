
public class ThreadExample {

	public static void main(String... args) {

	Runnable r1 = new Runnable() {
		public void run() {
				System.out.println("Hello world from " + Thread.currentThread().getName()); 
		}
	};
	// Runnable is already a functional interface
	Runnable r2 = () ->  System.out.println("Hello world  from " + Thread.currentThread().getName()); 
	(new Thread(r1)).start();
	(new Thread(r2)).start();

	}
}


