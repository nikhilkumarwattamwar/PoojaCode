package MultiThreading;
class Hi implements Runnable{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e) {}
		}}
}
class Hello implements Runnable{
		public void run(){
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
				try{Thread.sleep(1000);}catch(Exception e) {}}
	}
	}


public class Multi {

	public static void main(String[] args) throws InterruptedException {
		Runnable hi =new Hi();
		Runnable hello=new Hello();
		Thread t1=new Thread(hi);
		Thread t2=new Thread(hello);

		 t1.start();
		try{Thread.sleep(50);}catch(Exception e) {}
	     t2.start();
	     t1.yield();
	     t1.join();
	     System.out.println("1 complete");
	     t2.join();
	     System.out.println("2 complete");

	}

}
