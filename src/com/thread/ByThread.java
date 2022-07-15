package com.thread;

class ThreadOne extends Thread{
	public void run() {
		System.out.println("thread is runing...........");
	}
}

public class ByThread {
   public static void main(String[] args) {
	   ThreadOne t=new ThreadOne();
	   t.start();
}
}
