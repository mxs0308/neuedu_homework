package com.neuedu.thread;

public class TestThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadRunnableDemo1 tr = new ThreadRunnableDemo1();
		
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		
		t1.start();
		t2.start();
		
		//输出1-20之间在整数
		for(int i = 1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName() + " "+i);
		}

	}

}
