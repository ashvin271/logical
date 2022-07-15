package com.thread;

class ThreadTwo implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ByRunnable {
	public static void main(String[] args) {
		ThreadTwo t=new ThreadTwo();
		Thread th=new Thread(t);
		th.start();
	}
}
