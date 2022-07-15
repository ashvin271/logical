package lembdathread;

public class ThreadDemo {
	public static void main(String[] args) {
		// first thread using runnable functional interface
		
		Runnable thread1=()->{
			
			for (int i = 0; i < 20; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(thread1);
		t.setName("john");
		t.start();
	}
}
